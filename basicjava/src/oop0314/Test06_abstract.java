package oop0314;

abstract class Animal{ //�߻�Ŭ����
	String name;
	void view() { //�Ϲ� �޼ҵ�
		System.out.println("Animal.view()...");
	} 
	
	abstract void disp(); //�߻�޼ҵ�
}//class end

//�߻�Ŭ������ �ַ� �θ�ũ���� ���Ҹ� �Ѵ�
class Elephant extends Animal{
	//�߻�Ŭ������ ��ӹ����� �ݵ�� �߻�޼ҵ带 ������ (override)�ؾ� �Ѵ�.
	@Override
	void disp() {
		System.out.println("Elephant.disp()...");
	}
}

class Tuna extends Animal{
	@Override
	void disp() {
		System.out.println("Tuna.disp()...");
	}
}


public class Test06_abstract {
	public static void main(String[] args) {
		//�߻�Ŭ���� Abstract Class
		//->�̿ϼ�
		//->�߻�޼ҵ尡 �Ѱ��� ������ �߻�Ŭ����
		//->�߻�޼ҵ� : �Լ��� ���{}�� ���� �޼ҵ�
		//->�߻�޼ҵ� �������� : ������ �Լ�();
		//->�߻�޼ҵ�� �Ϲݸ޼ҵ尡 ���� ����ɼ� �ִ�
		
		//�������̽� Interface
		//->�߻�޼ҵ常 �����ϴ�
//------------------------------------------------------------
		
		//�߻�Ŭ������ ��ü ������ �� ����
		//Animal ani=new Animal();
		//�߻�Ŭ������ �������� �θ��ҷ� ���� Ȱ���Ѵ�
		
		Elephant jumbo=new Elephant();
		jumbo.view();
		jumbo.disp();
		
		Tuna nemo = new Tuna();
		nemo.view();
		nemo.disp();
		
//-------------------------------------------------------------
		//�߻�Ŭ������ ������
		
		Animal ani=new Elephant();
		ani.disp();
		
		ani=new Tuna();
		ani.disp();
		
		
	}//main() end
}//class end
