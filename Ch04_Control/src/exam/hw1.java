package exam;
import java.util.*;

/*
 * 1 부터 100까지의 홀수의 합과 짝수의 합을 구하기
 */
public class hw1 {
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
		
		var koreanS = inputInt("국어점수를 입력하세요. : ");
		var engS = inputInt("영어점수를 입력하세요. : ");
		var mathS = inputInt("수학점수를 입력하세요. : ");	
		var javaS = inputInt("자바점수를 입력하세요. : ");	
		var avarage = (double)(javaS+engS+koreanS)/3.0;
		
		print("\n==================================");
		printf("국어점수 : %d\n", koreanS);
		printf("영어점수 : %d\n", engS);
		printf("수학점수 : %d\n", mathS);
		printf("자바점수 : %d\n", javaS);
		printf("총   점 : %d\n", javaS+engS+koreanS);
		printf("평   균 : %.2f\n", avarage);
		print("==================================");
	}
}
