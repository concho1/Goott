package goott;
import java.util.*;

/*
 * for 이용 1-100까지 홀수합, 짝수합 구하기
 */
public class ForExam_22 {

	public static void main(String[] args) {
		int even = 0, odd = 0;
		for(int i=1; i<101; i++){
			if(i%2 == 0) even  += i;
			else odd+= i;
		}
		System.out.println("짝수");
		System.out.println(even);
		System.out.println("홀수");
		System.out.println(odd);
	}
}
