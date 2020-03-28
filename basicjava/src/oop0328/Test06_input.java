package oop0328;

import java.io.*;

public class Test06_input {
	public static void main(String[] args) {
		//���� ���� �б�
		try {
			String fileName="D:/java0201/javaGit/java2020/basicjava/src/oop0328/Test03_thread.java";
			
			//���� ��������
			FileReader fr = new FileReader(fileName);
			
			//���� ���� �б�(cursor�� �� ���� ����Ŵ)
			BufferedReader br = new BufferedReader(fr);
			
			int cnt = 0; // ���ȣ
			
			while(true) {
				//����(\n)�� �������� �о��
				String line = br.readLine();
				if(line == null) { //������ ������? ENd of File
					break;
				}
				
				System.out.println((++cnt)+line);
				//10�ึ�� ���� �߱�
				if(cnt%10 ==0) {
					System.out.println("******************************************************");
				}
			}
			//�ڿ��ݳ�(��������)
			br.close();
			fr.close();
			
		}catch (Exception e) {
			System.out.println("���� :"+e);
		}
		
	}//main() end
}//class end
