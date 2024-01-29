package goott;
import java.util.*;

/*
 * 신장별 표준 체중 대응표
 * 표시할 신장 범위(시작값 / 종료값 / 증가값)는
 * 정수로 할 예정, 키보드 입력을 받을 예정.
 * 
 * 표준 체중을 구하는 공식 (신장 - 100) * 0.9
 * 
 */
public class ForExam_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 cm부터 표시 할까요? : ");
		int start = sc.nextInt();
		System.out.print("몇 cm까지 표시 할까요? : ");
		int end = sc.nextInt();
		System.out.print("몇 cm단위로 표시 할까요? : ");
		int step = sc.nextInt();
		
		System.out.println();
		
		for(int i=start; i<=end; i+=step) {
			System.out.printf("%dcm\t%.1fkg\n", i,(i-100)*0.9);
		}
		
		sc.close();
	}
}
