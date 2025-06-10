package Ch11;

class InvalidEXception extends Exception{
	public InvalidEXception(String s) {
		super(s);
	}
}
public class EX_05 {
	void check(int weight) throws InvalidEXception{
		if(weight < 100) {
			throw new InvalidEXception("InvalidEXception 클래스 호출입니");
			
		}
	}
	
	public static void main(String[]args) {
		EX_05 obj = new EX_05();
		try {
			obj.check(60);
		}
		catch(InvalidEXception ex) {
			System.out.println("예외 처리입니다.");
			System.out.println(ex.getMessage());
		}
	}

}
