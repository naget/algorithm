package practice.annotation_test;

/**
 * created by tianfeng on 2018/11/12
 */
@Data(id = "1")
public class User {
    private String name;
    private String passward;
    public User(){}

    public static void main(String[] args) {
        User.annotationProcesser(User.class);
    }
    public static void annotationProcesser(Class<?> c){
        Data data = c.getAnnotation(Data.class);//运行期被丢弃的话这儿就拿不到了
        if (data!=null){
            System.out.println(data.id()+data.description());
        }
    }
}
