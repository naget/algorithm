package practice.strings;

/**
 * created by tianfeng on 2018/9/19
 */
public class ForceSearch {
    public int search(String txt,String pat){
        int N = txt.length();
        int M = pat.length();
        for (int i=0;i<=N-M;i++){
            int j;
            for (j=0;j<M;j++){
                if (txt.charAt(i+j)!=pat.charAt(j))break;
            }
            if (j == M)return i;
        }
        return N;
    }
}
