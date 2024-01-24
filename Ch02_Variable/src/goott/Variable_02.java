package goott;
/*
 * 변수(Variable)
 * 
*/
public class Variable_02 {

	public static void main(String[] args) {
		// 한번 해보니 둘다 같음 = 해도 참조형도 주소가 아니라 값이 들어감
		int num1 = 2;
		int num2 = num1;
		System.out.println(num2);
		num2 = 3;
		System.out.println(num1);
		Integer pNum1 = 2;
		Integer pNum2 = pNum1;
		System.out.println(pNum2);
		pNum2 = 3;
		System.out.println(pNum1);
		System.out.println(pNum2);
	}

}
