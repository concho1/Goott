package myGoott;

public class Korean2 {
	// 필드 변수 선언
	String nation = "대한민국";
	String name;
	String ssn;
	
	public Korean2() {
		this("홍길동", "무언가");
	}
	public Korean2(String name) {
		this(name, "무언가");
	}
	// 생성자 오버로딩 가능
	public Korean2(String name, Integer ssn) {
		this(name, Integer.toString(ssn));
	}
	// 생성자 선언 오버라이딩 이용
	public Korean2(String name, String ssn) {
		// 매계변수와 필드변수명이 같음으로
		// 필드변수임을 알려주기 위해 this를 사용
		this.name = name;
		this.ssn = ssn;
	}
	// 가변길이 매계변수
	void fuc(int ... values) {
		
	}
}
