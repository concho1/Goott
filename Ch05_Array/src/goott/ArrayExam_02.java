package goott;
import java.util.*;
/*
 * 내가 여행 가고 싶은 5개 나라를 입력받아 저장 후 화면 출력
 */
public class ArrayExam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] con = new String[5];
		for(int i=0; i<5; i++) {
			System.out.printf("가고싶은 %d 번째 나라를 입력하세요. : ", i+1);
			con[i] = sc.next();
		}
		System.out.println("\n선택한 나라 목록: ");
		for(int i=0; i<5; i++) {
			System.out.printf("%d. %s\t", i+1, con[i]);
		}
		
	}
}
