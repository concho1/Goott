package goott;

import java.util.*;

/*
 * 비트연산자
 */
public class Operator_08 {

	public static void main(String[] args) {
	      int val1 = 15;
	      int val2 = 20;
	      System.out.printf("val1 :  %s\n",Integer.toBinaryString(val1));
	      System.out.printf("val1 : %s\n",Integer.toBinaryString(val2));
	      System.out.println(
	    		  "(val1^val2) : "+Integer.toBinaryString((val1^val2)));
	      System.out.println(
	    		  "(val1|val2) : "+Integer.toBinaryString((val1|val2)));
	      System.out.println(
	    		  "(val1&val2) :   "+Integer.toBinaryString((val1&val2)));
	      System.out.println(
	    		  "(~val2): "+Integer.toBinaryString((~val2)));
	}
}
