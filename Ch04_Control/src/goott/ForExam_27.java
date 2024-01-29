package goott;
import java.util.*;

/*
 * 구구단
 */
public class ForExam_27 {

	public static void main(String[] args) {
		for(int a=0; a<=9; a++) {
			for(int b=1; b<=9; b++) {
				if(a==0) {
					if(b==1)System.out.printf("  %d단",b);
					else	System.out.printf("          %d단",b);
					
				}else {
					System.out.printf(" %-2dx%2d = %2d ", b, a, a*b);
				}
			}System.out.println();
		}
		
	}
}
