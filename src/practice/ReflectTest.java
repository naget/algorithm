package practice;

/**
 * Created by tianfeng on 2018/4/15.
 */
public class ReflectTest {
    {
        System.out.println("构造块");
    }
    static{
        System.out.println("静态构造块");
    }
    public ReflectTest(){
        System.out.println("构造方法");
    }
}
