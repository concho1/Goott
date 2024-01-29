package goott;
import java.util.*;

/*
 * 1.
 * ******
 * ******
 * ******
 * ******
 * 2.
 * *
 * **
 * ***
 * ****
 * *****
 * 3.
 * *****
 * ****
 * ***
 * **
 * *
 * 
 */
public class ForExam_28 {

	public static void main(String[] args) {
		System.out.println("1.");
		for(int i=0; i<4; i++) {
			for(int j=0; j<7; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("2.");
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("3.");
		for(int i=0; i<5; i++) {
			for(int j=i; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
