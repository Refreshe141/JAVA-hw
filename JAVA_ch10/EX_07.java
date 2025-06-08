package Ch10;
import Ch10.EX_06;
public class EX_07 {

	public static void main(String[] args) {
		EX_06 dog01 = new EX_06();
		EX_06 dog02 = new EX_06();
		System.out.println(dog01.equals(dog02));
		
		String str1 = dog01.bowwow();
		String str2 = dog02.bowwow();
		System.out.println(str1.equals(str2));
		
	

	}

}
