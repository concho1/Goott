package method;

/*
 * 실인수 ==> 매계변수 주기 용
 * 가인수 ==> 메서드 내에서 매계변수 받기 용
 */
public class MethodExam_03 {
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
