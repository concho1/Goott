package hwPack;

public class Wk3_06 {
	public static void main(String[] args) {
		int[] arr = new int[25];
		int cnt = 0;
		for(int j=1; j<6; j++) {
			for(int i=0; i<j; i++) {
				arr[i] = ++cnt;
				System.out.printf("%-2d   ", arr[i]);
			}
			System.out.println();
		}
		
	}
}
