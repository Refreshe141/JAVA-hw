package Ch11;

public class EX_03 {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30};
		
		try {
			for (int i = 0; i <= 3; i++) {
				System.out.println("arr[" + i + "] : " + arr[i]);
			}
			
		}
		catch(Exception ex) {
			System.out.println("예외 처리입니다....");
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("예외 방생 여부와 상관없이 실행됩니다.");
		}
	}

}
