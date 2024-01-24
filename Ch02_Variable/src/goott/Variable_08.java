package goott;
import java.util.*;
public class Variable_08 {

	public static void main(String[] args) {
		//변수 선언 및 초기화
		int su1 = 47, su2 = 83;
		System.out.printf("su1: %d, su2: %d\n", su1, su2);
		// 기초적인 변수 swap방법
		int tm = su1;
		su1 = su2;
		su2 = tm;
		System.out.printf("su1: %d, su2: %d\n", su1, su2);
		// List와 Collections의 swap을 이용한 방법
		List<Integer> suList = new ArrayList<Integer>();
		suList.add(su1);	suList.add(su2);
		Collections.swap(suList, 0, suList.size()-1);
		System.out.printf("su1: %d, su2: %d\n", suList.get(0), suList.get(1));
	}
}