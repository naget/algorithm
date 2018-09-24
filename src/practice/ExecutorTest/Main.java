package practice.ExecutorTest;

import practice.dbutil.DButil;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/**
 * created by tianfeng on 2018/6/23
 */
public class Main {
    public static void main(String[] args) {
        SearchService searchService = new SearchService(new DButil());
        GradeSearch gradeSearch = new GradeSearch(Executors.newFixedThreadPool(10),searchService);
        List<String> list = new ArrayList<>(10);
        list.add("\"点点\"");
        list.add("\"平平\"");
        list.add("\"美美\"");
        list.add("\"团团\"");
        try {
            gradeSearch.search(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
