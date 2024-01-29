package exam;

import java.util.*;

public class hw4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 4자리 숫자 입력 : ");
		int mo = sc.nextInt();
		
		System.out.printf("입력받은 숫자 ==> %d\n", mo);
		System.out.printf("오천원 지페 : %d장\n", mo/5000);	mo %= 5000;
		System.out.printf("천원 지페  : %d장\n", mo/1000);	mo %= 1000;
		System.out.printf("오백원 동전 : %d개\n", mo/500);	mo %= 500;
		System.out.printf("백원 동전  : %d개\n", mo/100);	mo %= 100;
		System.out.printf("오십원 동전 : %d개\n", mo/50);	mo %= 50;
		System.out.printf("십원 동전  : %d개\n", mo/10);	mo %= 10;
		System.out.printf("일원 동전  : %d개\n", mo);
		sc.close();
	}

}

