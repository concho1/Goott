package goott;
/*
 * char는 2바이트
 * - 자바에서는 유니코드(UTF-8) 체계로 단일문자 처리가 된다.
*/
public class Variable_06 {

	public static void main(String[] args) {
		char ch1 = 'B';
		char ch2 = 'ㅂ';
		System.out.println(ch1);
		System.out.println((int)ch2);
		System.out.println((char)(12610));
	}
}