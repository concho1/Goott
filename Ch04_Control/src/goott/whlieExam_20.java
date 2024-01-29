package goott;
import java.util.*;

/*
 * 1 부터 100까지의 홀수의 합과 짝수의 합을 구하기
 */
public class whlieExam_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var input = new ArrayList<Integer>();
		for(int i=0; i<5; i++)	input.add(sc.nextInt());
		
		// 최대 최소 구하는듯?
		// 방법1
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for(int i : input) {
			if(max < i) max = i;
			if(min > i) min = i;
		}
		System.out.println(max);
		System.out.println(min);
		
		// or
		//방법 2
		System.out.println(Collections.max(input));
		System.out.println(Collections.min(input));
	}
}
