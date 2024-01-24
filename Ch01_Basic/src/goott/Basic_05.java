package goott;
import java.util.*;
/*
 * 숫자 + 숫자 => 숫자
 * 
*/
public class Basic_05 {
	public static void main(String[] args) {
		// int + int = int
		System.out.println(10 + 23);
		// int + string 시 string으로 캐스팅
		System.out.println("10" + 23);
		// String + String 또한 String
		System.out.println("10" + "23");
		// 타입캐스팅도 앞에서 부터 진행함
		// int 5 + int 4 => int 9 + int 7 => int 16
		// int 16 + String 5 => String 165
		System.out.println(5 + 4 + 7 + "5");
	}
}
