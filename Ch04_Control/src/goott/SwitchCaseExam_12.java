package goott;
import java.util.*;
/*
 * sitch case
 * jdk 1.7부턴 String 사용 가능
 */
public class SwitchCaseExam_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1과 3 사이의 숫자를 입력하세요: ");
		int su = sc.nextInt();
		// 기본적인 switch case default 문법
		switch(su) {
		case 1 : System.out.println(su);	break;
		case 2 : System.out.println(su);	break;
		case 3 : System.out.println(su);	break;
		default: System.out.println("범위 초과");
		}
		// 람다식을 이용한 문법
		String reString = switch(su) {
		case 1 -> "입력 받은 숫자는 "+String.valueOf(su)+ " 입니다.";
		case 2 -> "입력 받은 숫자는 "+String.valueOf(su)+ " 입니다.";
		case 3 -> "입력 받은 숫자는 "+String.valueOf(su)+ " 입니다.";
		default -> "1 ~ 3 이외의 숫자가 입력 되었습니다.";
		};	System.out.println(reString);
		
		
		sc.close();
	}
}
