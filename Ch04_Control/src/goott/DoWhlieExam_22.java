package goott;
import java.util.*;

/*
 * while문을 이용해서 -1이 입력될 때 까지
 * 정수를 계속 입력 받아 합을 구하고,
 * -1이 입력이 되면 while문을 빠져 나와서
 * 평균을 구하는 프로그램
 */
public class DoWhlieExam_22 {

	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.println(++i);
		} while (i < 10);
		//1부터 10까지 화면에 출력해 보기
		i = 0;
		while(i < 10) {
			System.out.println(++i);
		}
		
	}
}
