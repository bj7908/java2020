package oop0314;

import java.util.Calendar;
import java.util.GregorianCalendar;

class Father extends Object{
	public String name="�ƹ���";
	public String addr="�ּ�";
	
	public Father() {}
	public Father(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}
	public void disp() {
		System.out.println(this.name);
		System.out.println(this.addr);
	}
} //class end

class Son extends Father{
	public Son() {}
	public Son(String n, String a) {
		super(n,a);
	}
}//class end

class Daughter extends Father{
	String friend="��ģ";
	public Daughter() {}
	public Daughter(String n, String a) {
		super(n,a);
	}
}//class end

public class Test04_poly {

	public static void main(String[] args) {
		//��Ӱ��迡���� ������ polymorphism
		//��� : extends(Ȯ��), implement(����)
		//�θ�������� ���°� ��������
		//Ŭ�����鰣�� ����ȯ �۾��� ������
		
		
		//�������� ��)
		//�������� = ��ü����
		//GregorianCalendar now = new GregorianCalendar();
		//�������� ����� ��ü ����
		//Calendar today = new GregorianCalendar();
		//Object obj = new Integer(3);
//----------------------------------------------------------
		/*
		//1) �Ϲ����� ����� ��ü ����
		//-> new�����ڸ� ���
		//-> POJO(plain Old Java Object)���
		Father fa = new Father();
		fa.disp();
		
		Son son = new Son();
		son.disp();
		*/
//----------------------------------------------------------
		/*
		//2)�������� �ƿ��� ��ü ����
		//->�ڽ�Ŭ������ �θ�Ŭ������ ���� �����ϴ�
		//->�θ�Ŭ������ �ڽ�Ŭ������ ������� ��ȯ�� ���԰����ϴ�.
		Father father=new Son("�����","����");
		father.disp();
		
		father=new Daughter("�迬��","�ѱ�");
		father.disp();
		
		System.out.println(father.name);
		System.out.println(father.addr);
		//�ڽ�Ŭ������ ���Ӱ� �߰��� ����� �������� ����� �ƴϴ�
		//System.out.println(father.friend); //����
		*/
//----------------------------------------------------------
		//3)�θ�Ŭ������ �ڽ�Ŭ������ �����Ҽ� �ִ�.
		//  (��, �ڽ��� ������� ��ȯ�� �����ϴ�)
		Father father = new Father();
		Son son = new Son();
		
		//�ڽ��� �θ� ���԰����ϴ�
		father = son;
		//�θ�� �ڽĿ��� �����ϱ� ���ؼ� ����ȯ�� �ؾ��Ѵ�.
		//�θ� �ڽĿ� ���԰��������� ������ �սǰ� Exception�� �߻� �� ���� ����
		son = (Son)father;
//----------------------------------------------------------
		Object obj=new Integer(3);
		Integer inte= (Integer) obj;
		
		
	}//mian() end
}//class end
