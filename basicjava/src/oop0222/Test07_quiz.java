package oop0222;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Test07_quiz {

	public static void main(String[] args) {
		// String Ŭ���� ����
		
		String email = new String("Webmaster@ezen.com");
		//��)@���ڸ� �������� ���ڿ��� �и��ؼ� ����Ͻÿ�.
		String[] emailSplit= email.split("@");
		
		for(int i=0 ; i<emailSplit.length ; i++) {
			System.out.println(emailSplit[i]);
		}
		
		//2)subSting()�̿��ؼ�
		int g= email.indexOf('@');
		String a = email.substring(0, g);
		String b = email.substring(g+1);
		
		System.out.println(g);
		System.out.println(a);
		System.out.println(b);
		

//-----------------------------------------------------------------------
		//��) �ֹι�ȣ�� �̿��ؼ� ������ ���� ����Ͻÿ�.
		String jumin="9302021234567";
		//������� : 1989�� 12�� 30��
		//���� : ����
		//���� : 30
				
		String num1 = jumin.substring(0,6);
		String num2 = jumin.substring(6,13);
		
		int Year = Integer.parseInt(num1.substring(0,2));
		String month = num1.substring(2,4);
		String day = num1.substring(4,6);
		
		int code = Integer.parseInt(num2.substring(0,1));
		String codes = ""; //����
		
		if(code == 1 || code == 3 || code == 5) {
			codes = "���� : ����";
		}else {
			codes = "���� : ����";
		}
		if(code == 1 || code == 2) {
			Year = 1900+Year;
		}else if(code == 3 || code == 4){
			Year = 2000+Year;
		}
		
		Calendar calendar = new GregorianCalendar(Locale.KOREA);
		int nYear = calendar.get(Calendar.YEAR);
		
		int age = nYear-Year+1;
		
		System.out.println(Year+"�� "+month+"�� "+day+"��");
		System.out.println(codes);
		System.out.println("���� : "+age);
	}

}
