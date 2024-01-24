package goott;
/*
 * 실수 자료형 : 소수점 발생하는 자료형
 * float => 보통 소수점 6-7자리 사이
 * double => 보통 소수점 15-16자리 사이
 * IEEE754 포메팅을 보통 사용함
 * IEEE754는 소수점을 한정된 bit수 이내에 많이 표현하기 위해
 * 소수의 근사치를 저장한다.
 * 아마 0에 가까울수록 더 많은 자리수를 표현 가능한 거로 알고 있음
*/
public class Variable_05 {

	public static void main(String[] args) {
		// 0에 가까울수록 소수점 더 많이 가능한지 확인해 보자
		float d1 = 3000.001F;
		float d2 = 0.00000000000000000021F;
		System.out.printf("%.20f\n",d1);
		System.out.printf("%.20f\n",d2);
		//결과 : 0 에 가까울수록 많은 소수점 범위 표현 가능
	}
}