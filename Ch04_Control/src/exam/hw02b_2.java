package exam;
import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class hw02b_2 {

	public static void main(String[] args) {
		System.out.println("** coffee 메뉴 ***");
		System.out.println("1. 아메리카노 - 3,000원");
		System.out.println("2. 카페라떼 - 4,000원");
		System.out.println("3. 마키아또 - 4,500원");
		System.out.println("4. 바닐라라떼 - 4,500원");
		String[] menuStrings = {"","아메리카노", "카페라떼", "마키아또", "바닐라라떼"};
		int[] menuCost = {0, 3000, 4000, 4500, 4500};
		Scanner sc = new Scanner(System.in);
		System.out.print("위 메뉴 중 하나를 선택하세요. : ");
		int menuNum = sc.nextInt();
		System.out.print("주문수량 >> ");
		int or = sc.nextInt();
		System.out.print("입금액 >> ");
		int mo = sc.nextInt();
		System.out.println();
		
		System.out.printf("주문한 메뉴 : %s\n", menuStrings[menuNum]);
		System.out.printf("커피단가 : %,d\n", menuCost[menuNum]);
		System.out.printf("주문수량 : %,d\n", or);
		System.out.printf("입금액 : %,d\n", mo);
		System.out.printf("총금액 : %,d\n", (int)(or*menuCost[menuNum]*1.1));
		System.out.printf("거스름 돈 : %,d\n", mo-(int)(or*menuCost[menuNum]*1.1));
	}

}
