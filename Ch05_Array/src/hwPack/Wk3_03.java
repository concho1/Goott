package hwPack;
import java.util.*;

public class Wk3_03 {
	static class student{
		String name;
		Integer koSc;
		Integer enSc;
		Integer maSc;
		Integer total;
		Double average;
		String score;
		
		student(String name, Integer koSc, Integer enSc, Integer maSc){
			this.name = name;
			this.koSc = koSc;
			this.enSc = enSc;
			this.maSc = maSc;
			this.total = (koSc+enSc+maSc);
			this.average = this.total/3.0;
			if(this.average > 90) score = "A";
			else if(this.average > 80) score = "B";
			else if(this.average > 70) score = "C";
			else if(this.average > 60) score = "D";
			else score = "F";
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		var studentList = new LinkedList<student>();
		System.out.print("학생 수를 입력하세요. : ");
		int stCnt = sc.nextInt();
		
		for(int i=0; i<stCnt; i++) {
			
			System.out.print("이름 입력 : ");
			String name = sc.next();
			System.out.print("국어점수 입력 : ");
			Integer ko = sc.nextInt();
			System.out.print("영어점수 입력 : ");
			Integer en = sc.nextInt();
			System.out.print("수학점수 입력 : ");
			Integer ma = sc.nextInt();
			studentList.add(new student(name, ko, en, ma));
		}
		Collections.sort(studentList, (a,b) -> a.total.compareTo(b.total));
		
		int lank = 0;
		while(!studentList.isEmpty()) {
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			student st = studentList.pollLast();
			System.out.printf("이름 : %s   총점 : %2d   평균 : %.2f   학점 : %s   순위 : %d등   \n",
					st.name, st.total, st.average, st.score, ++lank);
		}
		sc.close();
	}
}
