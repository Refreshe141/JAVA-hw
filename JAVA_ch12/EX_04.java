package ch12;
import java.io.File;
import java.io.FileInputStream;
public class EX_04 {

	public static void main(String[] args) {
		// 파일정보 읽어오기 (FileInputStream)
		File file = new File("구구단.txt");
		try {
			if(!file.exists())
				file.createNewFile();
			
			FileInputStream fis = new FileInputStream(file);
			int i = 0;
			
			while((i = fis.read()) != -1) {
				System.out.print((char) i);		
			}
			fis.close();
			System.out.println("파일 읽기 성공");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
