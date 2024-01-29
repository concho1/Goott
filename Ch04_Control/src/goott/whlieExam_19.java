package goott;
import java.util.*;

/*
 * 43 17 64 98 11 
 */
public class whlieExam_19 {
	public static void main(String[] args) {
		char alpa = 'A';
		while(alpa <= 'Z') {
			System.out.printf("%c ", alpa++);
		} System.out.println();
		
		while(alpa > 'A') {
			System.out.printf("%c ", --alpa);
		}
	}
}
