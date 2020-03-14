package oop0314;

class School extends Object{
	public String name="�б�";
	public School() {
		System.out.println("School()...");
	}
};//class end

class MiddleSchool extends School{
	public String name="���б�";
	public MiddleSchool() {
		//�θ������ �Լ� ȣ�� ��ɾ� �����Ǿ� ����
		super();
		
		System.out.println("MiddleSchool()...");
	}
}//class end

class HighSchool extends School{
	String name="����б�";

	public HighSchool() {
		super(); //��������
		System.out.println("HighSchool()...");
	}
	
	public void disp() {
		String name="��������б�";
		System.out.println(name); 	   //��������: ��������б�
		System.out.println(this.name); //�������: ����б�
		System.out.println(super.name);//�θ𺯼�: �б�
	}
	
}//class end


public class Test02_super {
	public static void main(String[] args) {
		//����, �θ�,super
		//super   :�ڽ�Ŭ�������� �θ�Ŭ���� ��������� ������ �� ����
		//super() :�ڽ�Ŭ������ �������Լ��� �θ�Ŭ������ �������Լ��� ȣ�⶧
		
		//this    :�������(field)�� ���������� �����ϱ� ���� ��
		//this()  :�ڽ��� ������ �Լ��� ȣ���Ҷ�
		
		//�θ�����ں��� ȣ�� -> �ڽ��� ������ ȣ��
		//School() -> MiddleSchool()
		MiddleSchool ms = new MiddleSchool();
		
		HighSchool hs = new HighSchool();
		hs.disp();
		
	}//main() end
}//class end
