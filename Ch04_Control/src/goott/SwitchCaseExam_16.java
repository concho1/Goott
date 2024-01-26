package goott;
import java.util.*;
/*
 * sitch case
 * jdk 1.7부턴 String 사용 가능
 */
public class SwitchCaseExam_16 {

	public static void main(String[] args) {
		//1-10까지의 합 구하기
		// 1 2 3 4 5
		int start = 56, end = 5161218, sum = 0;
		sum = ((end-start) % 2 == 1) ? (end + start)*((end-start)/2 + 1) : (end + start)*((end-start)/2)+(end + start)/2;
		System.out.println(sum);
		int sum2 = 0;
		for(int i=start; i<end+1; i++) {
			sum2 += i;
		}
		System.out.println(sum2);
	}
}
