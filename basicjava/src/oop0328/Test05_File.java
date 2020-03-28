package oop0328;

import java.io.File;

//import java.io.*;



public class Test05_File {
	public static void main(String[] args) {
		//FileŬ����
		//->���� ����(���ϸ�, Ȯ���, ����ũ��)�� Ȯ���� �� �ִ�.
		
		try {
			//String fileName = "D:\\java0201\\Java����.txt";
			//��� ���н� / ��� ������
			String fileName = "D:/java0201/Java����.txt";
			
			//���� ���
			File file = new File(fileName);
			if(file.exists()) {		//������ �����ϴ���?
				System.out.println("��������");
				long filesize = file.length();
				System.out.println(filesize+"����Ʈ(byte)");
				System.out.println(filesize/1024+"KB");
				
				//���ϸ�
				System.out.println(file.getName());
				//��θ�+���ϸ�
				System.out.println(file.getPath());
				
				file.delete();
				//������ ��������� �ȉ���� �ٽ� Ȯ���ϱ�
				if(file.exists()) {
					System.out.println("���ϻ����̿Ϸ�");
				}else {
					System.out.println("���ϻ����Ϸ�");
				}
				
				
				
			}else {
				System.out.println("���Ͼ���"); 
			}
			
		}catch (Exception e) {
			System.out.println("����"+ e);
		}//try end
		
		
		
	}//main() end
}//class end
