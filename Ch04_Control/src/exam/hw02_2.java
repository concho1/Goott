package exam;
import java.util.*;
public class hw02_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("지방의 그램을 입역하세요 : ");
		int gibang = sc.nextInt();
		System.out.print("탄수화물의 그램을 입역하세요 : ");
		int tansu = sc.nextInt();
		System.out.print("단백질의 그램을 입역하세요 : ");
		int danback = sc.nextInt();
		
		System.out.printf("총칼로리 : %,d cal", gibang*9+(tansu+danback)*4);;
		
	}

}
