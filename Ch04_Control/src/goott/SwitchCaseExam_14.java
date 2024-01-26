package goott;
import java.util.*;
/*
 * sitch case
 * jdk 1.7부턴 String 사용 가능
 */
public class SwitchCaseExam_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 a ~ c 사이의 단어 중에서 한 글자 입력: ");
		char ch = sc.next().charAt(0);
		
		// 람다식을 이용한 문법
		String reString = switch(ch) {
		case 'a' -> "선택한 과일은 apple 입니다.";
		case 'b' -> "선택한 과일은 bannana 입니다.";
		case 'c' -> "선택한 과일은 cherry 입니다.";
		default -> "선택한 과일이 없습니다.";
		};	System.out.println(reString);
		
		sc.close();
	}
}
