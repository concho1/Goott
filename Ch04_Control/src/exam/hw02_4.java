package exam;
import java.util.*;
public class hw02_4 {

	public static void main(String[] args) {
		int starLine = 11, maxStar = 6;
		
		var starList = new LinkedList<String>();
		for(int i=0; i<starLine; i++) {
			if(i < maxStar)	starList.add("*");
			else starList.pop();
			System.out.println(String.join("", starList));
		}
	}

}
