package exam;
import java.util.*;
public class hw02b_1 {

	public static void main(String[] args) {
		int total = 0;
		for(int i=1; i<=100; i++) {
			if(i%2 ==0) {
				total -= i;
			}else {
				total += i;
			}
		}
		System.out.printf("hap ==> %d", total);
	}

}
