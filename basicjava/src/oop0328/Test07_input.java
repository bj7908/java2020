package oop0328;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test07_input {
	public static void main(String[] args) {
		//character��� -> �ѱ� �ȱ���
		FileReader fr = null;
		try {
			String fileName="D:/java0201/javaGit/java2020/basicjava/src/oop0328/Test03_thread.java";
			//���� ��������
			fr =new FileReader(fileName);

			while(true) { //���� LOOP
				//1 character������
				int data = fr.read();
				if(data == -1) {//End of File ����?
					break;
				}
				System.out.printf("%c",data);

			}//while end
			
		}catch (Exception e) {
			System.out.println("����:"+e);
		}finally {
			try {
				if(fr!=null) {fr.close();}
			}catch (Exception e) {}
		}
		
	}//main() end
}//class end
