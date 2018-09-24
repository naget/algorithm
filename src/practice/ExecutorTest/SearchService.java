package practice.ExecutorTest;

import practice.dbutil.DButil;

import java.sql.ResultSet;
import java.util.List;

/**
 * created by tianfeng on 2018/6/23
 */
public class SearchService {
    private DButil dButil;
    SearchService(DButil dButil){
        this.dButil = dButil;
        dButil.connectMysql();
    }
    public Student search(String sql,String name) throws Exception {
        Student student = new Student();
        if (dButil==null)
            throw new Exception("SearchService没有设置数据源");

        ResultSet resultSet = dButil.query(sql+name);
        while (resultSet.next()){
            student.setName(name);
            student.setAge(resultSet.getInt("age"));
        }
        return student;
    }
}
