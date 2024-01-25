package goott;
import java.util.*;
/*
 * 이름, 국어점수, 영어점수, 자바점수를 키보드로 입력받아서 출력
 * A 90이상, B 80-89, C, D, F 59이하
 * 출력화면:
 * 이   름 : 0 0 0
 * 국어점수 : 00점
 * 영어점수 : 00점
 * 자바점수 : 00점
 * 총   점 : 000점
 * 평   균 : 00.00점
 * 학   점 : 0 학점
 */
public class IfElseEaxm_11 {
	static void print(String s) {System.out.println(s);}
	static void printf(String s, int i) {System.out.printf(s,i);}
	static void printf(String s, double i) {System.out.printf(s,i);}
	static void printf(String s, String i) {System.out.printf(s,i);}
	static int inputInt(String s) {
		Scanner sc = new Scanner(System.in);
		System.out.print(s);
		int re = sc.nextInt();
		//sc.close();
		return re;
	}
	static String inputStr(String s) {
		Scanner sc = new Scanner(System.in);
		System.out.print(s);
		String re = sc.next();
		//sc.close();
		return re;
	}
	
	
	
	public static void main(String[] args) {
		var name = inputStr("이름을 입력하세요. : ");	
		var koreanS = inputInt("국어점수를 입력하세요. : ");
		var engS = inputInt("영어점수를 입력하세요. : ");	
		var javaS = inputInt("자바점수를 입력하세요. : ");	
		var avarage = (double)(javaS+engS+koreanS)/3.0;
		
		print("\n==================================");
		printf("이   름 : %s\n", name);
		printf("국어점수 : %d\n", koreanS);
		printf("영어점수 : %d\n", engS);
		printf("자바점수 : %d\n", javaS);
		printf("총   점 : %d\n", javaS+engS+koreanS);
		printf("평   균 : %.2f\n", avarage);
		
		if(avarage >= 90) 		print("학   점 : A 학점");
		else if(avarage >= 80) 	print("학   점 : B 학점");
		else if(avarage >= 70) 	print("학   점 : C 학점");
		else if(avarage >= 60) 	print("학   점 : D 학점");
		else 					print("학   점 : F 학점");
	}
}
