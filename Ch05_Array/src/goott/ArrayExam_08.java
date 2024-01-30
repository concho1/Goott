package goott;
import java.util.*;


/*
 * 
 */
public class ArrayExam_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수형 배열 크기 입력 : ");
		int[] sort = new int[sc.nextInt()];
		
		for(int i=0; i<sort.length; i++) {
			System.out.printf("%d 번째 정수 입력 : ",i);
			sort[i] = sc.nextInt();
		}
		Arrays.sort(sort);
		
		for(int i: sort) System.out.printf("%d  ",i);
	}
}
