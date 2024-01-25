package goott;
import java.util.*;
public class IfExam_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int su = sc.nextInt();
		if(su > 90) {
			System.out.println("90이상\nA학점");
		}else if(su > 80){
			System.out.println("80이상\nB학점");
		}else {
			System.out.println("80이하\nF학점");
		}

	}

}
