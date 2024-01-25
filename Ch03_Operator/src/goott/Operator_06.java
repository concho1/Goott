package goott;
/*
 * 논리연산자, 이항연산자
 * &&, ||, ^, !
 * ^ => 같 0, 다 1
 */
public class Operator_06 {

	public static void main(String[] args) {
		int num1 =3, num2 = 3; //0011
		System.out.println("num1 ^ num2 : " + (num1 ^ num2));
		num1 <<= 1; //0110
		System.out.println(num1);
		System.out.println("num1 ^ num2 : " + (num1 ^ num2));
		System.out.println("num1 ^ num2 : " + (true ^ true));
	}
}
