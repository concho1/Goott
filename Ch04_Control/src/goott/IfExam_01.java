package goott;

public class IfExam_01 {

	public static void main(String[] args) {
		int key = 2;
		
		int result = switch (key) {
		    case 1 -> 1;
		    case 2 -> 2;
		    case 3 -> 3;
		    case 4 -> 4;
		    default -> 0;
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
		int su = 53;
		if(su > 50) {
			System.out.println("50이상");
		}else {
			System.out.println("50이하");
		}

	}

}
