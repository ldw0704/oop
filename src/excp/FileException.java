package excp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class FileException {

	public static void main(String[] args) {
		File file = new File("1234.txt");
		int data = 0;
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			
			while((data =  fis.read()) != -1) { 
				//eof 파일의끝에는 값 -1을 준다(글자없음 아스키코드포함)
				// 한 글자씩 읽어들임
				System.out.println((char)data);
			}			
		} catch (Exception e) {}
		finally {
			
			try {
				if(fis != null) fis.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
	}
}
