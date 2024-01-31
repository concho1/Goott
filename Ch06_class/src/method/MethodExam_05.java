package method;

import java.util.Scanner;

/*
 * [문제] 키보드로 입력 받은 수 까지의 홀수의 합과 
 * 짝수의 합을 구하는 메서드를 만들고
 * 메서드 호출해서 화면에 보이기 
 */
public class MethodExam_05 {
	static int[] sum(int num, int num2) {
		int[] reArr = {0,0};
		for(int i=num; i <= num2; i++) {
			if(i%2 == 0) reArr[0] += i;
			else  reArr[1] += i;
		}
		return reArr;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a부터 n 까지 더할 숫자 a 을 입력하시요 : ");
		int inInt1 = sc.nextInt();
		System.out.print("a부터 n 까지 더할 숫자 n 을 입력하시요 : ");
		int inInt2 = sc.nextInt();
		
		var result = sum(inInt1, inInt2);
		System.out.printf("짝수의 합 : %d\n홀수의 합 : %d\n", result[0], result[1]);
		sc.close();
	}

}
