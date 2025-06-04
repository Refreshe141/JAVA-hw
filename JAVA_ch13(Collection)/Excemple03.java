package collection;
import java.util.Vector;
public class Excemple03 {

	public static void main(String[] args) {
		Vector<String> cats = new Vector<String>();
		cats.add("페르시안");
		cats.add(null);
		System.out.println(cats);
		cats.add(1,"샴");
		System.out.println(cats);
		cats.add(2,"러시안블루");
		System.out.println(cats);
		cats.remove(1);
		System.out.println(cats);
		System.out.println(cats.size());
		System.out.println(cats.get(0));
		System.out.println(cats.contains("샴"));
		System.out.println(cats.indexOf("샴"));
		
		
		

	}

}
