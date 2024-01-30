package myGoott;

public class Korean {
	// 필드 변수 선언
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 생성자 선언
	public Korean(String name, String ssn) {
		// 매계변수와 필드변수명이 같음으로
		// 필드변수임을 알려주기 위해 this를 사용
		this.name = name;
		this.ssn = ssn;
	}
	// 생성자 오버로딩 가능
	public Korean(String name, Integer ssn) {
		this.name = name;
		this.ssn = Integer.toString(ssn);
	}
	;
}
