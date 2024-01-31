package method;

import java.util.Scanner;

/*
 * 
 */
public class MethodExam_06 {
	static int sum(int num1, int num2) {
		return num1 + num2;
	}
	static int de(int num1, int num2) {
		return num1 - num2;
	}
	static int div(int num1, int num2) {
		return num1 / num2;
	}
	static int na(int num1, int num2) {
		return num1 % num2;
	}
	static int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int inInt1 = sc.nextInt();
		System.out.print("연산자 입력 : ");
		String str = sc.next();
		System.out.print("두번째 정수 입력 : ");
		int inInt2 = sc.nextInt();
		
		int re = switch(str) {
		case "+"->sum(inInt1, inInt2);
		case "-"->de(inInt1, inInt2);
		case "*"->mul(inInt1, inInt2);
		case "/"->div(inInt1, inInt2);
		case "%"->na(inInt1, inInt2);
		default -> -1;
		};
		System.out.printf("%d %s %d = %d",inInt1, str, inInt2, re);
		sc.close();
	}

}
