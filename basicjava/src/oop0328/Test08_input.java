package oop0328;

import java.io.FileInputStream;
import java.io.FileReader;

public class Test08_input {
	public static void main(String[] args) {
		//byte��� -> �ѱ۱���
		FileInputStream fis = null;
		try {
			String fileName="D:/java0201/javaGit/java2020/basicjava/src/oop0328/Test03_thread.java";
			fis =new FileInputStream(fileName);

			while(true) { //���� LOOP
				int data = fis.read(); //1����Ʈ ����
				if(data == -1) {//End of File ����?
					break;
				}
				System.out.printf("%c",data);
			}
		}catch (Exception e) {
			System.out.println("����:"+e);
		}finally {
			try {
				if(fis!=null) {fis.close();}
			}catch (Exception e) {}
		}
		

	}//main() end
}//class end
