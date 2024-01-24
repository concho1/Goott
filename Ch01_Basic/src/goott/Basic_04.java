package goott;
import java.util.*;
/*
 * [문제] 아래와 같은 내용을 콘솔 창에 출력해 보세요
 * 
 *  이 름 : 임 정 훈
 *  연락처 : 010-4725-3440
 *  이메일 : jhehun@gmail.com
 *  주 소 : 경기도 파주시
*/
public class Basic_04 {
	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("이름", "임 정 훈");
		map.put("연락처", "010-4725-3440");
		map.put("이메일", "jhehun@gmail.com");
		map.put("주소", "경기도 파주시");
		for(String s : map.keySet()) {
			System.out.println(s + " : " + map.get(s));
		}
		// TODO Auto-generated method stub
		System.out.printf("\n%s", "이 름\t");
		System.out.println(": 임 정 훈");
		System.out.printf("%s", "연락처\t");
		System.out.println(": 010-4725-3440");
		System.out.printf("%s", "이메일\t");
		System.out.println(": jhehun@gmail.com");
		System.out.printf("%s", "주 소\t");
		System.out.println(": 경기도 파주시");
	}
}
