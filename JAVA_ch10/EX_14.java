package Ch10;
import java.util.StringTokenizer;
public class EX_14 {

	public static void main(String[] args) {
		
		StringTokenizer str = new StringTokenizer("Welcome to java programming!");
		
		
		System.out.println("str.nextElement():");
		while(str.hasMoreElements()) {
			System.out.println(str.nextElement());
			
		}

	}

}
