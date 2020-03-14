package oop0314;

import java.lang.*; //�ڹ��� �⺻ ��Ű��
					//������ �� �ִ�

class Korea extends Object{ //extends Object ������ �� �ִ�
	String name="���ѹα�";
	public void disp() {
		System.out.println(name);
	}
}//class end

class Seoul extends Korea{
	String name="����Ư����";
	@Override
	public void disp() {
		System.out.println(name);
	}
	@Override
	public String toString() {
		return "[name=" + name + "]";
	}
}//class end

class Busan extends Korea{
	private String name="�λ걤����";
	private String addr="���ѹα� ����";
	
	//�ڵ��� ���� üũ�ϴ� �뵵�� ���� Ȱ��
	//toString()�޼ҵ� �ڵ��߰� �� �� ����
	//Source->Generate toString()..
	@Override
	public String toString() {
		return "Busan [name=" + name + ", addr=" + addr + "]";
	}
	
}//class end

public class Test01_Object extends Object{
	public static void main(String[] args) {
		//object Ŭ����
		//->�ڹ��� �ְ� ���� Ŭ����
		//->java.lang ��Ű���� ���� �Ǿ� ����
		//->�ڹ��� ��� Ŭ������ ObjectŬ������ �ļյ��̴�.(O)
		
		Seoul se = new Seoul();
		se.disp();
		//se.toString();
		System.out.println(se.toString());
		System.out.println(se); //toString()�޼ҵ���� �����ϸ鼭 ȣ�� �����ϴ�.
		
		Busan bu =new Busan();
		System.out.println(bu.toString());
		System.out.println(bu);
		
		
	}//main() end
}//class end
