package ch12;
import java.io.File;
import java.io.IOException;
public class EX_FIleMake {
	public static void main(String[] args) {
		// 파일생성
		File fileObj = new File("Filemake01.txt");
		try {
			boolean success = fileObj.createNewFile();
			if(success) {
				System.out.println("파일 생성 성공");
			}
			else {
				System.out.println("파일 생성 실패");
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
