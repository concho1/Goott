package hwPack;

public class Wk3_04 {
	public static void main(String[] args) {
		int[] arr = new int[25];
		for(int i=1; i<arr.length+1; i++) {
			arr[i-1] = i;
			System.out.printf("%2d   ", arr[i-1]);
			if(i%5==0)System.out.println();
		}
	}
}
