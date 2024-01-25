package goott;

import java.util.*;

/*
 * 
 */
public class Operator_10 {

	public static void main(String[] args) {
		  int val1 = -20;
	      System.out.printf("val1        : %s\n",Integer.toBinaryString(val1));
	      System.out.println(
	    		  "(val1 >> 1) : "+Integer.toBinaryString((val1 >> 1)));
	      System.out.println(
	    		  "(val1 >>> 1):  "+Integer.toBinaryString((val1 >>> 1)));
	      System.out.println(
	    		  "(val1 << 1) : "+Integer.toBinaryString((val1 << 1)));
	      System.out.println(
	    		  "(~val2): "+Integer.toBinaryString((~val1)));
	      System.out.println(
	    		  "(val1 >> 1) : "+((val1 >> 1)));
	      System.out.println(
	    		  "(val1 >>> 1):  "+((val1 >>> 1)));
	}
}
