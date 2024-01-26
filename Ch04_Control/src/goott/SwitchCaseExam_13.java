package goott;
import java.util.*;
/*
 * sitch case
 * jdk 1.7부턴 String 사용 가능
 */
public class SwitchCaseExam_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요: ");
		int su = sc.nextInt();
		// 기본적인 switch case default 문법
		switch(su%5) {
		case 0 : System.out.println("입력 받은 "+String.valueOf(su)+ " 는 5의 배수입니다.");	break;
		case 1 : System.out.println("입력 받은 "+String.valueOf(su)+ " 는 5의 배수가 아닙니다. 나머지가 1입니다.");	break;
		case 2 : System.out.println("입력 받은 "+String.valueOf(su)+ " 는 5의 배수가 아닙니다. 나머지가 2입니다.");	break;
		case 3 : System.out.println("입력 받은 "+String.valueOf(su)+ " 는 5의 배수가 아닙니다. 나머지가 3입니다.");	break;
		case 4 : System.out.println("입력 받은 "+String.valueOf(su)+ " 는 5의 배수가 아닙니다. 나머지가 4입니다.");	break;
		default: System.out.println("오류");
		}
		// 람다식을 이용한 문법
		String reString = switch(su%5) {
		case 0 -> "입력 받은 "+String.valueOf(su)+ " 는 5의 배수입니다.";
		case 1 -> "입력 받은 "+String.valueOf(su)+ " 는 5의 배수가 아닙니다. 나머지가 1입니다.";
		case 2 -> "입력 받은 "+String.valueOf(su)+ " 는 5의 배수가 아닙니다. 나머지가 2입니다.";
		case 3 -> "입력 받은 "+String.valueOf(su)+ " 는 5의 배수가 아닙니다. 나머지가 3입니다.";
		case 4 -> "입력 받은 "+String.valueOf(su)+ " 는 5의 배수가 아닙니다. 나머지가 4입니다.";
		default -> "오류";
		};	System.out.println(reString);
		
		
		sc.close();
	}
}
