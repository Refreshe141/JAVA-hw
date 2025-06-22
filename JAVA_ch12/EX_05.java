package ch12;

import java.io.File;
import java.io.FileReader;

public class EX_05 {

    public static void main(String[] args) {
        // 파일정보 읽어오기(FileReader)
        File file = new File("member.txt");

        try {
            if (!file.exists())
                file.createNewFile();

            FileReader fis = new FileReader(file);
            int i = 0;

            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

            fis.close(); // 세미콜론 누락 수정
            System.out.println("파일 읽기 성공"); // println 오타 수정
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

