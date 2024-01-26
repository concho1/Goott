package exam;
import java.util.*;
public class hw2 {

	public static void main(String[] args) {
		// int는 -2^31 ~ 2^31 -1
		// 대충 2^10 = 1024넘으면 세제곱이 범위를 넘어가버림
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수를 입력하세요. : ");
		int num = sc.nextInt();
		if(num < 1025 || num < - 1024) {
			System.out.printf("입력받은 정수 ==> %d\n", num);
			System.out.printf("%d의 제곱근 ==> %d\n", num, num*num);
			System.out.printf("%d의 세제곱근 ==> %d\n", num, num*num*num);
		}else {
			System.out.printf("%d의 3제곱은 int범위를 초과합니다.\n", num);
		}
		sc.close();
	}

}
