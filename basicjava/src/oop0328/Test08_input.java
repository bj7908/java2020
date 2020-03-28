package oop0328;

import java.io.FileInputStream;
import java.io.FileReader;

public class Test08_input {
	public static void main(String[] args) {
		//byte기반 -> 한글깨짐
		FileInputStream fis = null;
		try {
			String fileName="D:/java0201/javaGit/java2020/basicjava/src/oop0328/Test03_thread.java";
			fis =new FileInputStream(fileName);

			while(true) { //무한 LOOP
				int data = fis.read(); //1바이트 읽음
				if(data == -1) {//End of File 인지?
					break;
				}
				System.out.printf("%c",data);
			}
		}catch (Exception e) {
			System.out.println("실패:"+e);
		}finally {
			try {
				if(fis!=null) {fis.close();}
			}catch (Exception e) {}
		}
		

	}//main() end
}//class end
