package Ch10;
import java.util.Scanner;
public class EX_10 {

	public static void main(String[] args) {
		String str = "";
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("입력 뮨자열: ");
		str = in.nextLine();
		
		int len = str.length();
		
		String revStr1 = "";
		
		for(int i = len -1; i >=0; i--) {
			revStr1 = revStr1 + str.charAt(i);
		}
		
		System.out.println("String 클래스의 역순 문자열:"+revStr1);
		
		StringBuffer revStr2 = new StringBuffer(str);
		revStr2.reverse();
		
		System.out.println("StringBuffer 클래스의 역순 문자열:"+revStr2);
		
		
		
		

	}

}
