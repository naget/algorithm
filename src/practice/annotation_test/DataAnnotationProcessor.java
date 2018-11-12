package practice.annotation_test;

import com.squareup.javawriter.JavaWriter;

import javax.annotation.processing.*;
import javax.lang.model.element.*;
import javax.lang.model.type.TypeMirror;
import javax.tools.*;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

/**
 * created by tianfeng on 2018/11/12
 * 利用注解在编译器自定义行为，生成getter和setter。通过注解处理器遍历所有的源文件，得到使用了我们自定义
 * 注解所标识的元素，然后通过特定的工具类生成java文件，并编译成为class文件。
 *
 * 这个注解处理器需要打成Jar包来传递给javac使用
 * 注解处理器
 *javac会启动一个jvm来进行编译处理
 * 参考自：https://mp.weixin.qq.com/s/TF8Wlv_uF6czfkFzZdNRgg
 */
public class DataAnnotationProcessor extends AbstractProcessor {
    private Messager messager;
    private Filer filer;
    @Override
    public synchronized void init(ProcessingEnvironment processingEnv){
        super.init(processingEnv);
        messager = processingEnv.getMessager();
        filer = processingEnv.getFiler();
    }
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        messager.printMessage(Diagnostic.Kind.NOTE,"-------开始自动生成源代码");
        try {
            boolean isClass = false;
            String classAllName = null;
            //得到标记了Data注解的元素集合
            Set<? extends Element> elements = roundEnv.getElementsAnnotatedWith(Data.class);
            Element element = null;
            for (Element e:elements){
                if (e.getKind()== ElementKind.CLASS&& e instanceof TypeElement){
                    TypeElement t = (TypeElement) e;
                    isClass = true;
                    classAllName = t.getQualifiedName().toString();
                    element = t;
                    break;
                }
            }
            if (!isClass){
                return true;
            }
            //返回类内的所有节点
            List<? extends Element> enclosedElements = element.getEnclosedElements();
            Map<TypeMirror,Name> fieldMap = new HashMap<>();
            for (Element e:enclosedElements){//遍历节点，将所有字段的类型和名称存入map
                if (e.getKind()==ElementKind.FIELD){
                    TypeMirror typeMirror = e.asType();
                    Name simpleName = e.getSimpleName();
                    fieldMap.put(typeMirror,simpleName);
                }
            }
            //生成class源文件
            JavaFileObject sourcefile = filer.createSourceFile(getClassName(classAllName));
            //写入getter/setter
            createSourceFile(classAllName,fieldMap,sourcefile.openWriter());
            //手动编译
            compile(sourcefile.toUri().getPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        messager.printMessage(Diagnostic.Kind.NOTE,"------完成自动生成源代码以及编译成class文件");
        return true;

    }
    private void compile(String path) throws IOException {
        //拿到编译器
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        //文件管理者
        StandardJavaFileManager fileManager =
                compiler.getStandardFileManager(null,null,null);
        //获取文件
        Iterable units = fileManager.getJavaFileObjects(path);
        //编译任务
        JavaCompiler.CompilationTask t = compiler.getTask(null,fileManager,null,null,null,units);
        //开始编译
        t.call();
        fileManager.close();
    }
    private void createSourceFile(String classname, Map<TypeMirror,Name> fieldMap, Writer writer) throws IOException {
        //生成源代码
        JavaWriter jw = new JavaWriter(writer);
        jw.emitPackage(getPackage(classname));
        jw.beginType(getClassName(classname),"class",EnumSet.of(Modifier.PUBLIC));//类Public型
        for (Map.Entry<TypeMirror,Name> map:fieldMap.entrySet()){
            String type = map.getKey().toString();
            String name = map.getValue().toString();
            //字段
            jw.emitField(type,name,EnumSet.of(Modifier.PRIVATE));//字段private型
        }
        for (Map.Entry<TypeMirror,Name> map:fieldMap.entrySet()){
            String type = map.getKey().toString();
            String name =  map.getValue().toString();
            //getter
            jw.beginMethod(type,"get"+humpString(name),EnumSet.of(Modifier.PUBLIC))
                    .emitStatement("return"+name)
                    .endMethod();
            //setter
            jw.beginMethod(type,"set"+humpString(name),EnumSet.of(Modifier.PUBLIC))
                    .emitStatement("this."+name+"=arg")
                    .endMethod();
        }
        jw.endType().close();
    }
    private String humpString(String name){
        String result = name;
        if (name.length()==1){
            result = name.toUpperCase();
        }else {
        result = name.substring(0,1).toUpperCase()+name.substring(1);
        }
        return result;
    }
    private String getPackage(String name){
        String result = name;
        if (name.contains(".")){
            result = name.substring(0,name.lastIndexOf("."));
        }else {
            result ="";
        }
        return result;
    }
    private String getClassName(String name){
        String result = name;
        if (name.contains(".")){
            result = name.substring(name.lastIndexOf(".")+1);
        }else {
            result = "";
        }
        return result;
    }
}
