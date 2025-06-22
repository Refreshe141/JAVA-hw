package ch12;
import java.io.FileOutputStream;
import java.io.File;
public class EX_02 {

	public static void main(String[] args) {
		// 파일에 구구단저장(FileOutputStream 클래스)
		File file = new File("구구단.txt");
		try {
			if(!file.exists())
				file.createNewFile();
			
			FileOutputStream fos = new FileOutputStream(file);
			for (int x = 2; x <= 9; x++) {
			    for (int y = 1; y <= 9; y++) {
			        String str = x + " X " + y + " = " + (x * y) + "\n";
			        byte[] b = str.getBytes();
			        fos.write(b);
			    }
			}
			fos.close();			
		}
		catch(Exception e) {
			e.getMessage();
		}

	}

}
