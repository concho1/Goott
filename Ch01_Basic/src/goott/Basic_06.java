package goott;
import java.util.*;
/*
 * java 에서의 출력 양식
 * %s => String, %d => int 
 * %f => double, float
 * %p => 주소출력
 * %o => 8진수, char
 * %x => 16진수
 * .2 => 소수점 2자리 까지 제한(알아서 반올림 해줌)
 * 2  => 2칸 기준으로 오른쪽 정렬
 * -2 => 2칸 기준으로 왼쪽 정렬
 * ,  => 은행식 숫자 표현
*/
public class Basic_06 {
	public static void main(String[] args) {
		double a = 23.1545;
		System.out.printf("double: %.2f\n", a);
		System.out.printf("8진수: %o\n16진수: %x\n", 16, 16);
		System.out.printf("왼쪽 정렬 %-10d %d\n", 234, 123);
		System.out.printf("오른쪽 정렬 %10d %d\n", 234, 123);
		System.out.printf("%,d", 10000000);
	}
}
