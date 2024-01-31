package method;

/*
 * 1부터 100까지의 짝수합과 홀수합 구하는 메서드 만들기
 */
public class MethodExam_02 {
	static int[] sum() {
		int[] reArr = {0,0};
		for(int i=1; i < 101; i++) {
			if(i%2 == 0) reArr[0] += i;
			else  reArr[1] += i;
		}
		return reArr;
	}
	
	public static void main(String[] args) {
		System.out.println("짝수 합 : " + sum()[0]);
		System.out.println("홀수 합 : " + sum()[1]);
	}

}
