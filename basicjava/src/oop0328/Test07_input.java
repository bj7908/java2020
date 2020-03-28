package oop0328;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test07_input {
	public static void main(String[] args) {
		//character기반 -> 한글 안깨짐
		FileReader fr = null;
		try {
			String fileName="D:/java0201/javaGit/java2020/basicjava/src/oop0328/Test03_thread.java";
			//파일 가져오기
			fr =new FileReader(fileName);

			while(true) { //무한 LOOP
				//1 character가져옴
				int data = fr.read();
				if(data == -1) {//End of File 인지?
					break;
				}
				System.out.printf("%c",data);

			}//while end
			
		}catch (Exception e) {
			System.out.println("실패:"+e);
		}finally {
			try {
				if(fr!=null) {fr.close();}
			}catch (Exception e) {}
		}
		
	}//main() end
}//class end
