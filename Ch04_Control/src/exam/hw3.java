package exam;

import java.util.*;

public class hw3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입금액 입력 : ");
		int mo = sc.nextInt();
		System.out.print("상품 단가 입력 : ");
		int po = sc.nextInt();
		System.out.print("상품 수량 입력 : ");
		int num = sc.nextInt();
		if(mo >= num*po) {
			System.out.printf("지불한 금액 : %d원\n", mo);
			System.out.printf("제품단가 : %d원\n", po);
			System.out.printf("수량 : %d\n", num);
			System.out.printf("부가세 : %d원\n", (po*num)/10);
			System.out.printf("지불한 금액 : %d원\n", (po*num) + (po*num)/10);
			System.out.printf("지불한 금액 : %d원\n", mo - (po*num) - (po*num)/10);
		}else {
			System.out.println("돈 부족");
		}
		
	}

}
