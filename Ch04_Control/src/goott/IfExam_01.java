package goott;

public class IfExam_01 {

	public static void main(String[] args) {
		int key = 2;
		
		String result = switch (key) {
		    case 1 -> "일";
		    case 2 -> "이";
		    case 3 -> "삼";
		    case 4 -> "사";
		    default -> "Other";
		};
		System.out.println(result);
		
		switch (key) {
			case 1: {
				System.out.println("1");
				break;
			}
			case 2: {
				System.out.println("2");
				break;
			}
			case 3: {
				System.out.println("3");
				break;
			}
			case 4: {
				System.out.println("4");
				break;
			}
			default: System.out.println("out of range");
		}

	}

}
