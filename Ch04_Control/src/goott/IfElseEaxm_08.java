package goott;
import java.util.*;
/*
 * 정수 입력받아 홀수인지 짝수인지 판별
 */
public class IfElseEaxm_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. :");
		System.out.println((sc.nextInt()%2 == 0) ? "짝수입니다." : "홀수입니다.");
		
		sc.close();
	}
}
