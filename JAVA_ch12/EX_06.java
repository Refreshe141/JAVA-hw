package ch12;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
public class EX_06 {

	public static void main(String[] args) {
		//파일정보 읽어오기(BufferedReader)
		 File file = new File("member.txt");
		 try {
			 if (!file.exists())
		         file.createNewFile();
			 
			 FileReader fis = new FileReader(file);
			 BufferedReader br = new BufferedReader(fis);
			 
			 String str;
			 
			 while((str = br.readLine())!= null) {
				 System.out.println(str);
			 }
			 fis.close();
			 System.out.println("파일 읽기 성공");		 
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
	}
}
