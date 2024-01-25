package goott;
import java.util.*;
/*
 * 키보드로 입력받은 정수가 음수이면
 * 입력받은 정수는 음수입니다 메세지 출력하기
 */
public class IfExam_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int su = sc.nextInt();
		sc.close();
		su >>>= 31;
		if(su==1) System.out.println("입력 받은 정수는 음수입니다.");
//		Byte byte1 = 127;
//		System.out.println(byte1);
//		System.out.println(++byte1);
//		System.out.println(++byte1);
	}
}
