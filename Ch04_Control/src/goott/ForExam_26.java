package goott;
import java.util.*;

/*
 * for 이용 1-n까지 홀수합, 짝수합 구하기
 */
public class ForExam_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. : ");
		int num = sc.nextInt();
		int even = 0, odd = 0;
		for(int i=1; i <= num; i++){
			if(i%2 == 0) even  += i;
			else odd+= i;
		}
		System.out.print("짝수 : ");
		System.out.println(even);
		System.out.print("홀수 : ");
		System.out.println(odd);
	}
}
