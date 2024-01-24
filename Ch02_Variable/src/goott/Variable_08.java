package goott;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
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
		
		//배열 => ArrayList
		int[] arr1 = {1,2,3,4,5};
		/*
		 * Arrays.stream(int[]) : int[] => Stream<int>로 변환
		 * Arrays.stream(int[]).boxed() => Stream<Integer>로 변환
		 * Stream<Integer>.collect(Collectors.toList()) => Arraa
		*/
		Stream<Integer> arrIntegers = Arrays.stream(arr1).boxed();
		List<Integer> arrList1 = Arrays.stream(arr1)
									   .boxed()
									   .collect(Collectors.toList());
		
		// forEach 메서드는 각 요소에 할당된 작업을 수행함
		arrIntegers.forEach(System.out::print);
		System.out.println();
		arrList1.forEach(System.out::print);
		System.out.println();
		//forEach응용법 => 람다식 표현으로 for문 처럼 사용하기
		arrList1.forEach(num ->{
			Integer numTm = num * 10;
			System.out.printf(" %d ",numTm);
		});
		System.out.println();
		
		// 다시한번 배열 => ArrayList복습
		int[] arrInt = {1,2,3,4,5};
		List<Integer> arrList = Arrays.stream(arrInt).boxed().collect(Collectors.toList());
		arrList.forEach(num -> {
			System.out.printf(" %d ",num);
		});
		System.out.println();
		
		//stream()과 mapToInt, toArray를 사용한 방법
		int[] arrIntNew = arrList.stream().mapToInt(Integer::intValue).toArray();
		for(int i : arrIntNew){
			System.out.printf(" %d ", i);
		}
		System.out.println();
		
		// 다시한번 배열 => ArrayList복습
		// String은 참조형이라 boxed필요 없음
		String[] arrString = {"sa", "asd", "asd"};
		List<String> arrList2 = Arrays.stream(arrString).collect(Collectors.toList());
		arrList2.forEach(str -> {
			System.out.printf(" %s ",str);
		});
		System.out.println();

	}
}