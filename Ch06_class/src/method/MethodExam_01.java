package method;

import java.util.Scanner;

/*
 * 접근제한 메소드 public > protected > default > private
 * method 작성법
 * 접근제한자 반환형 이름 (매계변수)
 * 
 */
public class MethodExam_01 {
	static int[] input(String str) {
		int[] arr = new int[3];
		System.out.println(str);
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) arr[i] = sc.nextInt();
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var arr = input("정수 3개 입력하시오. : ");
		for(var a : arr) {
			System.out.println(a);
		}
	}

}
