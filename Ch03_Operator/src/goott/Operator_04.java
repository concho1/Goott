package goott;
import java.util.Scanner;

public class Operator_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[3];
		try {
			for(int i=1; i<4; i++) {
				System.out.printf("%d번째 숫자를 입력하세요: ",i);
				numArr[i-1] = sc.nextInt();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("숫자(정수)만 입력하세요.");
		}
		
		System.out.println("덧셈연산 결과 >>> " + (numArr[0] + numArr[1]+ numArr[2]));
		sc.close();
	}
}
