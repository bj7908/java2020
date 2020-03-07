package oop0307;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test10_Calender {

	public static void main(String[] args) {
		//Calendar Ŭ����
		//��¥���� Ŭ����

		//�ý����� ��¥���õ� ������ ��������
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.get(1));		//�� 2020
		System.out.println(cal.get(2)+1);	//�� 3
		System.out.println(cal.get(5));		//�� 7
		
		System.out.println(cal.get(Calendar.YEAR)); 	//2020
		System.out.println(cal.get(Calendar.MONTH)+1); 	//3
		System.out.println(cal.get(Calendar.DATE));		//7
		
		System.out.println(cal.get(Calendar.HOUR));		//��
		System.out.println(cal.get(Calendar.MINUTE));	//��
		System.out.println(cal.get(Calendar.SECOND));	//��
		System.out.println("-------------------------------------");
		
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));	//��
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));	//����
		
		int weekday = cal.get(Calendar.DAY_OF_WEEK);
		switch(weekday) {
			case 1 :System.out.println("�Ͽ���");break;
			case 2 :System.out.println("������");break;
			case 3 :System.out.println("ȭ����");break;
			case 4 :System.out.println("������");break;
			case 5 :System.out.println("�����");break;
			case 6 :System.out.println("�ݿ���");break;
			case 7 :System.out.println("�����");break;
		}
//-----------------------------------------------------------------
		int cYear=2020;
		GregorianCalendar Gcal =new GregorianCalendar();
		if(Gcal.isLeapYear(cYear)){
			System.out.println("����");
		}else {
			System.out.println("���");
		}
		
		GregorianCalendar myBirth = new GregorianCalendar(1989,11,28);
		System.out.println(myBirth.get(Calendar.YEAR));
	}//main() end
}//class end
