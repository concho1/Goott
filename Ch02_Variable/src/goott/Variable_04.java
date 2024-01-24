package goott;

public class Variable_04 {

	public static void main(String[] args) {
		// byte => int 캐스팅 가능 항상 큰 값으로 타입 캐스팅 함
		// int => byte는 큰것에서 작은것으로 가는건 불가
		// 참조형도 그런지 확인해 보자
		Byte byte1 = 120;
		Integer integer1 = 130;
		//byte1 = integer1; <== 오류남
		String s = Integer.toString(integer1);
		System.out.println(byte1 + 'F' +" "+ s); //F=> 70(아스키코드)
		System.out.println(byte1 + " " + s);
		int som = (int)byte1; //명시적 캐스팅
		int som2 = byte1; //묵시적 캐스팅
		System.out.println(Integer.toString(som) +" "+ Integer.toString(som2));
	}

}
