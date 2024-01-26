package goott;
import java.util.*;
/*
 * sitch case
 */
public class SwitchCaseExam_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
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
		case 1 -> String.valueOf(su);
		case 2 -> String.valueOf(su);
		case 3 -> String.valueOf(su);
		default -> String.valueOf(su);
		};	System.out.println(reString);
		
		
		sc.close();
	}
}
