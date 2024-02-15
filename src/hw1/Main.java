package hw1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("고용형태-정규직<P>, 임시직<T>를 입력하세요.");

        if(sc.nextLine().contains("P")){
            System.out.println("이름,기본급,보너스를 입력하세요.");
            String[] strArr = sc.nextLine().trim().split(",");
            Permanent per = new Permanent(strArr[0], Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]));
            System.out.println("고용형태 : 정규직");
            System.out.println("이름 : " +per.getName());
            System.out.printf("급여 : %,d원",per.getPays());
        }else {
            System.out.println("이름,작업시간,시간당 급여를 입력하세요.");
            String[] strArr = sc.nextLine().trim().split(",");
            Temporary tem = new Temporary(strArr[0], Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]));
            System.out.println("고용형태 : 정규직");
            System.out.println("이름 : " +tem.getName());
            System.out.printf("급여 : %,d원",tem.getPays());
        }

        sc.close();
    }
}
