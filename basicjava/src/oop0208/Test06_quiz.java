package oop0208;

import java.util.Calendar;

public class Test06_quiz {

	public static void main(String[] args) {
		//�ֹι�ȣ�� �̿��ؼ� ���̿� ������ ���Ͻÿ�.
		int myYear = 19; //�¾ �⵵
		int code = 4;  	 //���� �ڵ�
		
		int Year;		 //���� ����
		
		//1) ���� : ���س⵵ - �¾ �⵵
		if(code == 1 || code == 2) {
			Year = 1900+myYear-1;
			System.out.print("���� ����: "+(2020-Year)+", ");
		}else {
			Year = 2000+myYear-1;
			System.out.print("���� ����: "+(2020-Year)+", ");
		}//if end
		
		
		//2) ����
		//if(code == 1 || code == 3) {
		if(code%2 != 0) {
			System.out.println("���� : ����");
		}else {
			System.out.println("���� : ����");
		}
		switch(code){
			case 1: 
			case 3: System.out.println("����"); break;
			case 2: 
			case 4: System.out.println("����"); break;
		}
		System.out.println();
	}//main() end
}//class end
