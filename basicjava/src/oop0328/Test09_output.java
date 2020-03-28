package oop0328;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Test09_output {

	public static void main(String[] args) {
		//���� ����ϱ�
		FileWriter fw = null;
		try {
			String fileName = "d:/java0201/sungjuk.txt";
			//���� ���� ��忡��
			//�ش������� �������� ������ ����(create)
			//����, �ش������� �����ϸ� ����(overwrite(�����) �Ǵ� append(�̾��))
			
			//true �߰�, false �����
			fw = new FileWriter(fileName, false);
			
			//true ����Ŭ����
			PrintWriter out = new PrintWriter(fw, true);
			out.println("�����,90,95,100");
			out.println("������,55,95,80");
			out.println("�迬��,100,60,70");
			out.println("������,90,75,100");
			out.println("���޷�,90,55,80");
			out.close();//�ڿ��ݳ�
			
			System.out.println("sungjuk.txt�ϼ���");
			
		}catch (Exception e) {
			System.out.println("����:"+e);
		}finally {
			try {
				if(fw != null) {fw.close();}
			}catch (Exception e) {}
		}

	}

}
