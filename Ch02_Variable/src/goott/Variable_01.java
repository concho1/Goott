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
public class Variable_01 {

	public static void main(String[] args) {
		// 아래는 기본형 변수 실제 값을 갖고있음
		boolean rBoolean = false;
		char rChar = 'c';
		byte rByte = 2; //8bit 정수형 -128 ~ 127
		int rInt = 34;
		float rFloat = 23.23F;
		double rDouble = 32.34;
		long rLong = 23; // 64bit 정수형
		
		// 아래는 참조형 변수 애네는 주소를 갖고있음
		Integer aInt = 23;
		Character aChar = 'c';
		String aString = "string";
		Float aFloat = 1.23F;
		Double aDouble = 1.23;
		Long aLong = 12L;
		
		System.out.println(Long.MAX_VALUE);
		System.out.printf("%d\n",aInt);
		
		System.out.printf("byte형의 크기      ==> %d bit\n",Byte.SIZE);
		System.out.printf("short형의 크기     ==> %d bit\n",Short.SIZE);
		System.out.printf("int형의 크기       ==> %d bit\n",Integer.SIZE);
		System.out.printf("long형의 크기      ==> %d bit\n",Long.SIZE);
		System.out.printf("float형의 크기     ==> %d bit\n",Float.SIZE);
		System.out.printf("double형의 크기    ==> %d bit\n",Double.SIZE);
		System.out.printf("char형의 크기      ==> %d bit\n",Character.SIZE);
		
	}

}
