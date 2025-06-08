package Ch10;

public class EX_09 {

	public static void main(String[] args) {
		String str1 = "www.google.com";
		
		
		String[] arrStr1;
		
		arrStr1 = str1.split("\\.");
		
		for(int i =0; i < arrStr1.length; i++) {
			System.out.println(arrStr1[i]);
		}

	}

}
