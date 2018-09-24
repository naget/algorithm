package practice.JzOffer;

/**
 * Created by tianfeng on 2018/3/19.
 */
public class JzOffer2 {

        public static String replaceSpace(StringBuffer str) {
            System.out.println(str.length());
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==' ')str.replace(i,i+1,"%20");
            }
            System.out.println(str.length());
            return str.toString();
        }

    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("hello whord")));
    }

}
