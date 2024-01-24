package goott;
/*
 * 변수(Variable)
 * - 프로그래밍에서 가장 기본적인 동작은 데이터를 저장하고,
 * 	 저장된 데이터의 값을 읽어오는 것임.
 * - 데이터의 값을 저장하려면 메모리에 값을 저장할 공간을 생성하고,
 *   이름을 부여해야 함.
 * - 변수는 하나의 데이터를 저장할 수 있는 메모리 공간을 의미함.
 * - 변수는 여러개의 값을 저장할 수 없고, 하나의 값만 저장 가능
*/
public class Variable_03 {

	public static void main(String[] args) {
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
