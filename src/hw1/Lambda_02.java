package hw1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

interface SuperA{
    void method1();
}
interface SuperB{
    void method2(int su);
}
interface SuperC{
    int method3();
}
interface SuperD{
    double method4(int su1, double su2);
}
public class Lambda_02 {
    public static void main(String[] args) {
        SuperA a = new SuperA() {
            @Override
            public void method1() {
                System.out.println("반환, 매개변수 없음");
            }
        };
        
        SuperB b = new SuperB() {
            @Override
            public void method2(int su) {
                System.out.println("매계변수 있고 반환타입 없음");
            }
        };
        SuperB bl = (x) -> System.out.println("매개변수 있고 반환타입 없는 함다식" + x);
        bl.method2(3);

        SuperC cl = () -> {
            System.out.println("매개변수 없고 반환타입은 있음");
            return 3;
        };

        SuperD dl = (x,d) -> {
            System.out.println("매개변수 있고 반환타입은 있음");
            return x*d;
        };
        // forEach라는 메서드를 람다식을 통해 오버리이딩
        //1번 방법
        int[] arr = {1,2,3,4,5,6};
        IntStream st = Arrays.stream(arr);
        st.forEach( (x) -> {
            System.out.print(x);
        } );

        // 2번 방법
        Arrays.stream(arr).forEach( x -> System.out.print(x) );

        System.out.println();
        // 3번 방법
        Arrays.stream(arr).forEach(System.out::print);

        // 원래 방법
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
