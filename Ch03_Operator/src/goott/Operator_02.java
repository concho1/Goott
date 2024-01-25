package goott;
/*
 * java의 연산자 종류
 * 산술연산자					+ - * / %
 * 관계연산자(비교연산자)			< > <= >=
 * 논리연산자					&& || ==
 * 단항연산자 / 감항연산자 		++ --
 * 배정연산자 / 단축배정 연산자		?
 * 비트연산자					& ^ |
 * 쉬프트 연산자				<< >>
 */
import javax.swing.JOptionPane;

public class Operator_02 {

	public static void main(String[] args) {
		// 키보드로 데이터를 입력받기
		String input1 = JOptionPane.showInputDialog("첫번째 숫자를 입력하세요");
		String input2 = JOptionPane.showInputDialog("두번째 숫자를 입력하세요");
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		System.out.println("덧셈연산 결과 >>> " + (num1 + num2));
	}

}
