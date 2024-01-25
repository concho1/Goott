package goott;
import java.util.*;
/*
 * 정수가 60점 이상이면 합격입니다. 출력
 */
public class IfExam_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int su = sc.nextInt();
		sc.close();
		if(su>=60) System.out.println("합격입니다.");
	}
}
