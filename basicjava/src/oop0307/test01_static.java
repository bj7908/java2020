package oop0307;

class Sawon{ //package �������� ����
	//�������(field)
	String sabun; //�����ȣ
	String name;  //�̸�
	int pay;      //�޿�
	
	//�������Լ�(constructor):Ŭ������� ������ �Լ�
	public Sawon() {} //default constructor �⺻������
	public Sawon(String sabun, String name, int pay) {
		this.sabun = sabun;
		this.name = name;
		this.pay = pay;
	}//�Լ� �ߺ� ���� (overloading)
	
	//static����
	static String COMPANY="(��)����";
	static double TAX=0.03;
	static int SUDANG=10;
	//static �Լ�
	static void line() {
		System.out.println("----------------------------");
	}
	
	
	
}//class end

public class test01_static {

	public static void main(String[] args) {
		//static ����
		//-> ����
		//-> �Լ�, ����
		//���ٹ�� : Ŭ������.�Լ�()
		//         Ŭ������.����
		
		//System.out.println(Math.PI);
		//System.out.println(Math.abs(-3));
		
//--------------------------------------------------
		//Ŭ����(���� �ڷ���)�� �޸��Ҵ��� �ؾ��Ѵ�.
		//->new ������ �Լ�()
		//->��ü(Object)
		//->��ü�� RAM�� heap������ �Ҵ�ȴ�.
		
		Sawon one=new Sawon("1001","������",100);// one��������
		//���� = �޿� *0.03
		int myTax= (int)(one.pay*one.TAX);
		//�����޾� : (�޿�+����)-����
		int total=(one.pay+one.SUDANG)-myTax;
		System.out.println("ȸ��: "+one.COMPANY);
		System.out.println("�����ȣ: "+one.sabun);
		System.out.println("�̸�: "+one.name);
		System.out.println("����: "+one.pay);
		System.out.println("����: "+one.SUDANG);
		System.out.println("�� ���޾�"+total);
		one.line();
//-------------------------------------------------
		//2)static�� Ư¡�� �ݿ��� ���
		//static������ �Լ��� �̹� static�޸𸮰�����
		//���� �ö�� �ֱ� ������ ������ ��ü �������̵� ���� �����ϴ�.
		Sawon two=new Sawon("2001","���޷�",200);// one��������
		myTax = (int)(two.pay*Sawon.TAX);
		total = (one.pay+Sawon.SUDANG)-myTax;
		System.out.println("ȸ��: "+Sawon.COMPANY);
		System.out.println("�����ȣ: "+two.sabun);
		System.out.println("�̸�: "+two.name);
		System.out.println("����: "+two.pay);
		System.out.println("����: "+Sawon.SUDANG);
		System.out.println("�� ���޾�"+total);
		Sawon.line();
		
//-------------------------------------------------
		//static������ ����
		//->static������ ������ 1��, �Ҹ굵 1�� �ȴ�.
		//->static������ ������ ��� �̾�����(continue)
		//->static������ �ּҰ� �����ȴ�.
		
		Sawon kim = new Sawon("3001","�趯��",300);
		Sawon lee = new Sawon("4001","�̶���",400);
		
		kim.pay = kim.pay+1;//301
		lee.pay = lee.pay+2;//402
		
		System.out.println(kim.pay);
		System.out.println(lee.pay);
		
		kim.SUDANG = kim.SUDANG+1;//11
		System.out.println(kim.SUDANG);
		lee.SUDANG = lee.SUDANG+1;//12
		System.out.println(lee.SUDANG);
		
		Sawon.SUDANG = Sawon.SUDANG+1;
		System.out.println(Sawon.SUDANG);//13
		System.out.println(kim.SUDANG);//13
		System.out.println(lee.SUDANG);//13
		
		
	}//main() end
}//class end
