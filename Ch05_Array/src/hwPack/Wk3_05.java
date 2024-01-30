package hwPack;

public class Wk3_05 {
	public static void main(String[] args) {
		int[] arr = new int[25];
		for(int j=1; j<6; j++) {
			for(int i=0; i<5; i++) {
				arr[i] = i*5 + j;
				System.out.printf("%2d   ", arr[i]);
			}
			System.out.println();
		}
		
	}
}
