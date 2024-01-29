package goott;
import java.util.*;
/*
 * [문제] 정수 입력받아서 5배수인지 확인
 */
public class IfExam_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int su = sc.nextInt();
		
		// 람다식
		System.out.println(
			(su%5 == 0 && su != 0) ? "이 정수는 5의 배수입니다." : "이 정수는 5의 배수가 아닙니다."
		);
		
		// if문
		if((su%5 == 0 && su != 0)) {
			System.out.println("이 정수는 5의 배수입니다." );
		}else {
			System.out.println("이 정수는 5의 배수가 아닙니다.");
		}
	}
}
