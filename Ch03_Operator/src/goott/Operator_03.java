package goott;
import java.util.Scanner;
public class Operator_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 키보드로 데이터를 입력받기
		String input1 = args[0];
		String input2 = args[1];
		System.out.println("첫번쨰 숫자 : " + input1);
		System.out.println("첫번쨰 숫자 : " + input2);
		System.out.println("세번째 숫자를 입력하시오 : ");
		String inputSc = sc.nextLine();
		sc.close();
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		int num3 = Integer.parseInt(inputSc);
		
		System.out.println("덧셈연산 결과 >>> " + (num1 + num2 + num3));
	}
}
