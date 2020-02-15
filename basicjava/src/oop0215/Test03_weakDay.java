package oop0215;

public class Test03_weakDay {

	public static void main(String[] args) {
		// ���� ���ϴ� ���α׷�
		int cYear = 2020, cMonth=2, cDate=15;
		
	/*
	 [���� 1�� 1�� 1��] ~ [���� 2020�� 2�� 15�� ������ �� ���� = ? 
	  �ѳ���%7 -> 0:��, 1:��, 2:ȭ, 3:��, 4:��, 5:��, 6:��
    */
	
	//1)�ܰ� : ���� 1��~ ���� 2019�� 
    //  ���� += 366
    //  ��� += 365
		
		int hap=0; //�� ������ ��
		for(int y=1 ; y<cYear ; y++) {
			if(y%4==0 && y%100!=0 || y%400==0) {
				hap = hap+366;
			}else {
				hap = hap+365;
			}//if end
		}//for end
		//System.out.println(hap);
  
	//2)�ܰ� : 1��~ 1��
    //  1, 3, 5, 7, 8, 10 ,12 : 31
	//  4, 6, 9 , 11          : 30
	//  2                     : 29(����)
	//  2                     : 28(���)
		
		int[] month1 = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		//���� �����
		if(cYear%4==0 && cYear%100!=0 || cYear%400==0) {
			month1[2] = 29;
		}
		for(int m=1 ; m<cMonth ; m++) {
			hap = hap+month1[m];
		}//for end
		
	//3)�ܰ� : ���� �����ش�.	
		hap=hap+cDate;
		System.out.println(hap);
		
	//4)�ܰ� : ������ �����ش�.
		String day ="";
		switch(hap%7) {
			case 0 : day = "��"; break;
			case 1 : day = "��"; break;
			case 2 : day = "ȭ"; break;
			case 3 : day = "��"; break;
			case 4 : day = "��"; break;
			case 5 : day = "��"; break;
			case 6 : day = "��"; break;
//			case 0 : System.out.println("�Ͽ���"); break;
//			case 1 : System.out.println("������"); break;
//			case 2 : System.out.println("ȭ����"); break;
//			case 3 : System.out.println("������"); break;
//			case 4 : System.out.println("�����"); break;
//			case 5 : System.out.println("�ݿ���"); break;
//			case 6 : System.out.println("�����"); break;
		}
		System.out.println(day);
		
	}//main() end
}//class end
