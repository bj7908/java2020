package oop0321;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Jumin {
	private String jumin; //�ֹι�ȣ
	public Jumin() {}
	public Jumin(String jumin) {
		this.jumin=jumin;
	}
	
	public boolean validate() {
		boolean flag = false;
		//�ֹι�ȣ�� �´��� �˻縦 �ؼ�,
		//�ֹι�ȣ�� ��ȿ�ϸ� flag���� true�� �ٲٽÿ�
		System.out.println("�Է¹��� �ֹι�ȣ:"+this.jumin);
		jumin = this.jumin;
		//�ֹι�ȣ ���� ���ϱ�
		//System.out.println(jumin.length());
		
		//�ֹι�ȣ�� ���� �迭
		int[] gop =new int[]{2,3,4,5,6,7,8,9,2,3,4,5};
		//�ֹι�ȣ�� ���� ���� �迭 �����
		int[] jumins = new int[jumin.length()];
		for(int i=0 ; i<jumin.length() ; i++) {
			jumins[i] = Integer.parseInt(jumin.substring(i,i+1));
		}
		//System.out.println(gop.length);
		//�ֹι�ȣ�� �迭 ���ϰ� ���ϱ�
		int sumSave = 0;
		for(int i=0 ; i< gop.length ; i++) {
			int sum = jumins[i]*gop[i];
			sumSave +=sum;
			//System.out.println(jumins[i]+" "+gop[i]+" "+sum+" "+sumSave);
		}
		//���Ŀ� �����ϱ�
		int M = (11-sumSave%11)%10;
		System.out.println("�������� ���� ����:"+M);
		
		if(jumins[jumins.length-1]==M) {
			flag = true;
		}
		
		return flag;
	}//validate() end
	
	public void disp() {
		//�������
		int myYear = Integer.parseInt(jumin.substring(0,2));
		int myMonth = Integer.parseInt(jumin.substring(2,4));
		int myDate = Integer.parseInt(jumin.substring(4,6));
		//�����ڵ�
		int code =Integer.parseInt(jumin.substring(6,7));
		
		switch(code) {
		 	case 1:
		 	case 2: myYear = myYear+1900; break;
		 	case 3:
		 	case 4: myYear = myYear+2000; break;
		}
		
		//���� ��¥ ����
		GregorianCalendar now = new GregorianCalendar();
		int cYear = now.get(Calendar.YEAR);
		
		//����
		int myAge = cYear-myYear;
		
		//����
		String myGender="";
		switch(code%2) {
		case 0: myGender="����"; break;
		case 1: myGender="����"; break;
		}
		
		//��
		String[] animal= {"������","��","��","����","��","��","ȣ����","�䳢","��","��","��","��"};
		
		
		System.out.println();
		System.out.println("�¾ ��¥:"+myYear+"�� "+myMonth+"�� "+myDate+"��");
		System.out.println("����:"+myGender);
		System.out.println("����:"+myAge);
		System.out.println("��:"+animal[myYear%12]);
		
		//��ƿ� ����(����- �¾ ��¥���� �Ϸ�� ���ؼ� ���ó�¥���� ���ϱ�)
	}//disp();
}
