package goott;

// 자바애서의 한 줄 주석문
/* 
 * 클레스 설명 주석 (여러줄) 
 * 클래스는 대문자로, 메서드는 소문자로 시작한다
 * main()메서드는 가장먼저 실행된다(시작위치).
 * JVM이 main()을 찾아서 안의 내용을 순차적으로 실행함
*/
/*
 * java소스코드 실행 과정
 * 1. 소스파일 .java 파일을 작성한 후
 * 2. 컴파일 하면 JVM환경 위에서 동작하는 바이트 코드(.class)가 생성됨
 * 이클립스를 사용하면 소스코드 저장만 해도 컴파일이 자동으로 실행
 * .class는 src와 bin 폴더 안에 위치함
 * 3. .class 실행하면 JVM이 운영체제에서 메모리를 할당 받아와서 실행이 된다.
*/

public class Basic_01 {
	public static void main(String[] args) {
		System.out.println("안녕하세요");
		
		// print는 end 가 \n가 아님
		System.out.print("3강의실");
		
		System.out.println("안녕");
	}
}
