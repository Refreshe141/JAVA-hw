package Ch10;
import java.util.Random;
public class EX_15 {

	public static void main(String[] args) {
		Random obj = new Random();
		System.out.println("obj:"+obj.nextInt());
		
		obj.setSeed(50);
		System.out.println("obj.setSeed(50):"+obj.nextInt());

	}

}
