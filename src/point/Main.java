package point;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        boolean resultFlag = false;
        for(int N=1; N < M; N++){
            int tm = N;
            for(char ch : String.valueOf(tm).toCharArray())
                tm += Character.getNumericValue(ch);

            if(M == tm) {
                System.out.println(N);
                resultFlag = true;
                break;
            }
        }
        if(!resultFlag)System.out.println("0");
    }
}
