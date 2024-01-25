package goott;
import java.util.Scanner;
/*
 * 관계연산자(비교연산자)
 * 결과는 boolean형
 */
public class Operator_05 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 5;
		System.out.println("num1 > num2 : " + (num1 > num2));
		System.out.println("num1 > num2 : " + (num1 >= num2));
		System.out.println("num1 > num2 : " + (num1 < num2));
		System.out.println("num1 > num2 : " + (num1 <= num2));
		System.out.println("num1 > num2 : " + (num1 == num2));
		System.out.println("num1 > num2 : " + (num1 != num2));
	}
}
