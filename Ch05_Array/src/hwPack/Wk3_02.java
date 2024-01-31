package hwPack;

import java.util.Scanner;

public class Wk3_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 숫자를 입력하세요. ");
		int[] arr = new int[5];
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<4; i++) {
			int tmMax = Integer.MIN_VALUE, tmIdx = 0;
			for(int j=i+1; j<5; j++) {
				if(tmMax < arr[j]) {
					tmMax = arr[j];
					tmIdx = j;
				}
			}
			if(arr[i] < tmMax) {
				arr[tmIdx] = arr[i];
				arr[i] = tmMax;
			}
		}
		for(int i=0; i<5; i++) {
			System.out.printf("%d ", arr[i]);
		}
		sc.close();
	}
}
