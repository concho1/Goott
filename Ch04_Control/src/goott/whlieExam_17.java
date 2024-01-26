package goott;
import java.util.*;
/*
 * sitch case
 * jdk 1.7부턴 String 사용 가능
 */
public class whlieExam_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("직급(사장/전무/부장/차장/과장/대리/사원) 중 하나의 직급을 선택하세요. ");
		String ch = sc.next();
		
		// 람다식을 이용한 문법
		int reInt = switch(ch) {
		case "사장" -> 1000;
		case "전무" -> 800;
		case "부장" -> 650;
		case "차장" -> 500;
		case "과장" -> 400;
		case "대리" -> 300;
		case "사원" -> 200;
		default -> -1;
		};	System.out.printf("%s의 월급은 %d 만원입니다.", ch, reInt);
		
		sc.close();
	}
}
