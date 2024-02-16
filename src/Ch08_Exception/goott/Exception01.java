package Ch08_Exception.goott;
import java.util.*;
public class Exception01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 10/0;
        try{

            System.out.println(sc.nextInt());
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("이건 무조건 실행할거");
        }

    }
}
