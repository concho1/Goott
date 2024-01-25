package goott;
import java.util.*;
/*
 * 정수가 5의 배수이면 이 정수는 5의 배수입니다. 출력
 * 아니면 이 정수는 5의배수가 아닙니다. 출력
 * 단, 음수면 "음수가 입력되었습니다. 출력
 */
public class IfElseEaxm_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		p("정수를 입력하세요. :");
		int num = sc.nextInt();
		
		if(num<0) 			p("음수가 입력되었습니다.");
		else if(num%5==0) 	p("이 정수는 5의 배수입니다.");
		else 				p("이 정수는 5의배수가 아닙니다.");
		
		sc.close();
	}
	static void p(String s) {
		System.out.println(s);
	}
}
