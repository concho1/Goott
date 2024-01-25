package goott;
import java.util.*;

/*
 * 점수 입력받아 60점 이상은 합격입니다. 미만은 불합격입니다.
 */
public class IfElseEaxm_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. :");
		System.out.println((sc.nextInt() >= 60) ? "합격입니다." : "불합격입니다.");
		
		sc.close();
	}
}
