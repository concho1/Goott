package exam;
import java.util.*;
public class hw02_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		int even = 0, odd = 0;
		for(int i=1; i<num+1; i++) {
			if(i%2==0) even += i;
			else odd += i;
		}
		System.out.printf("홀수합계 : %d\n", odd);
		System.out.printf("짝수합계 : %d", even);
	}

}
