package hw2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("도형을 선택하세요. (1.원형, 2.사각형)");

        Shape s;
        System.out.print("도형 선택 >>> ");
        switch(sc.nextInt()){
            case 1:
                System.out.print("반지름 입력 >>> ");
                s = new Circle(sc.nextInt());
                break;
            case 2:
                System.out.print("가로 >>> ");  int tm1 = sc.nextInt();
                System.out.print("세로 >>> ");  int tm2 = sc.nextInt();
                s = new Rectangle(tm1, tm2);
                break;
            default:
                s = new Circle(sc.nextInt());
                System.err.println("에러");
        }
        System.out.println("============================");
        System.out.printf("%s의 면적 : %.1f", s.getName() , s.findArea());
    }
}
