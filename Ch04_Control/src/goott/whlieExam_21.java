package goott;
import java.util.*;

/*
 * while문을 이용해서 -1이 입력될 때 까지
 * 정수를 계속 입력 받아 합을 구하고,
 * -1이 입력이 되면 while문을 빠져 나와서
 * 평균을 구하는 프로그램
 */
public class whlieExam_21 {

	public static void main(String[] args) {
		int tm = 0, i = 0, cnt = 0;
		Scanner sc = new Scanner(System.in);
		while(tm != -1) {
			tm = sc.nextInt();
			i += tm;
			cnt++;
		} System.out.println("평균은 " + Double.valueOf((double)i/cnt) + "입니다.");
		sc.close();
	}
}
