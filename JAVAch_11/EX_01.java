package Ch11;
import java.util.Scanner;

public class EX_01 {

	public static void main(String[] args) {
		//예외처리 방법 try~catch문
		Scanner s = new Scanner(System.in);
		System.out.println("숫자릅 입력하세요");
		int num1 = s.nextInt();
		
		
		try {
			int num2 = 10 / num1;
			System.out.println(num2);			
		}
		catch(Exception e) {
			System.out.println("올바른 숫자를 입력하세요");
			System.out.println(e.getMessage());
			e.printStackTrace();					
		}
		System.out.println("트라이 케치문 외부 문장");
	}

}
