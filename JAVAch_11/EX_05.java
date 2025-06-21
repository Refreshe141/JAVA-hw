package Ch11;
class InvalidException extends Exception{
	public InvalidException(String s) {
		super(s);
	}	
}
public class EX_05 {
	void check(int weight) throws InvalidException{
		if(weight < 100) {
			throw new InvalidException("InvalidException 클래스 호출");
		}
	}
	public static void main(String[] args) {
		//사용자 정의 예외처리
		EX_05 obj = new EX_05();
		try {
			obj.check(60);
		}
		catch(InvalidException ex) {
			System.out.println("예외처리 입니다.");
			System.out.println(ex.getMessage());
			
		}
		
		

	}

}
