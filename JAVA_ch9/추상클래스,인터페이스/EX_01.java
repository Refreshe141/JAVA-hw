package Ch9;

public class EX_01 {

	public static void main(String[] args) {
		//추상 클래스 
		Shape s1 = new Circle("빨간색", 2.2);
		Shape s2 = new Rectangle("노란색", 2,4);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());

	}

}
