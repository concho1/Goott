package hwPack;
import java.util.*;

public class Wk3_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 크기: ");
		int[] arr = new int[sc.nextInt()];
		
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d 번째 값 입력 : ", i+1);
			arr[i] = sc.nextInt();
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}
		System.out.printf("max: %d, min: %d", max, min);
		sc.close();
	}
}
