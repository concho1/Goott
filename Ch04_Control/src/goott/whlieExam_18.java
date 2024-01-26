package goott;
import java.util.*;

/*
 * 1 부터 100까지의 홀수의 합과 짝수의 합을 구하기
 */
public class whlieExam_18 {

	public static void main(String[] args) {
		//for문
		int even = 0, odd = 0; 
		for(int i=1; i<101; i++) {
			if(i%2 == 0) even += i;
			else odd += i;
		} 
		System.out.println(even);
		System.out.println(odd);
		
		//while문 even짝
		int even1 = 0, odd1 = 0, j = 0;
		while(j<100) {
			j++;
			if(j%2 == 0) even1 += j;
			else odd1 += j;
		}
		System.out.println(even1);
		System.out.println(odd1);
	}
}
