package goott;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * 맞다 ++num 하면 ++을 먼저(전위연산자)
 * num++ 하면 메서드 실행 먼저(후위연산자)
 */
public class Operator_07 {

	public static void main(String[] args) {
		int num1 = 1, num2 = 2;
		int num3 = (num1 > num2) ? num1 : num2;
		System.out.println(num3);
		num1++;
		num1++;
		num3 = (num1 > num2) ? num1 : num2;
		System.out.println(num3++);
		
		int su3 = 10, su4 = 20;
		System.out.println(++su3 + su4++);
		System.out.println((++su3 % 3)+ (su3 * su4++));
		//31 => 11, 21 => 0 + 12 * 22 = 264
		
		//int[] => ArrayList<Integer>() remind
		int[] iArr = {1,2,3,4};
		List<Integer> iList = Arrays.stream(iArr).boxed().collect(Collectors.toList());
		iList.forEach(i -> {
			System.out.println(i);
		});
		// ArrayList<Integer>() => int[]
		int[] iArrTm = iList.stream().mapToInt(Integer::intValue).toArray();
		for(int i : iArrTm) {
			System.out.println(i);
		}
		//int[] => ArrayList<Integer>() remind
		List<Integer> iListTm = new ArrayList<Integer>();
		for(Integer i : iArrTm) iListTm.add(i);
		iListTm.forEach(i -> System.out.println(i));
	}
}
