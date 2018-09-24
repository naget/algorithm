package practice.ExecutorTest;

import java.util.List;
import java.util.concurrent.*;

/**
 * created by tianfeng on 2018/6/23
 */
public class GradeSearch {
    private final ExecutorService executorService;
    private SearchService searchService;
    GradeSearch(ExecutorService executorService,SearchService searchService){
        this.executorService = executorService;
        this.searchService = searchService;
    }
    void search(List<String> list) throws Exception {
        CompletionService<Student> completionService = new ExecutorCompletionService<>(executorService);
        String sql = "select age from student where name=";
        for (String s:list) {
            completionService.submit(new Callable<Student>() {
                @Override
                public Student call() throws Exception {
                    return searchService.search(sql, s);
                }
            });
        }
            try {
                for (int t=0;t<list.size();t++){
                    Future<Student> f = completionService.take();
                    Student student = f.get();
                    System.out.println(student.getName()+": "+student.getAge());
                }
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }catch (ExecutionException e){
                throw new Exception(e.getCause());
            }
    executorService.shutdown();

    }
}
