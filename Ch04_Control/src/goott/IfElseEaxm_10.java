package goott;
import java.util.*;
/*
 * 정수가 5의 배수이면 이 정수는 5의 배수입니다. 출력
 * 아니면 이 정수는 5의배수가 아닙니다. 출력
 * 단, 음수면 "음수가 입력되었습니다. 출력
 */
public class IfElseEaxm_10 {
	static void print(String s) {System.out.println(s);}
	static int input(String s) {
		Scanner sc = new Scanner(System.in);
		System.out.print(s);
		int re = sc.nextInt();
		sc.close();
		return re;
	}
	
	public static void main(String[] args) {
		var num = input("정수를 입력하세요. : ");	
		
		if(num<0) 			print("음수가 입력되었습니다.");
		else if(num%5==0) 	print("이 정수는 5의 배수입니다.");
		else 				print("이 정수는 5의배수가 아닙니다.");
	}
}
