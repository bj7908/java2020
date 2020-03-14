package oop0314;

interface Animal2{
	//void view() {}; �Ϲݸ޼ҵ� ���Ұ�
	abstract void kind(); //�߻�޼ҵ常 �����ϴ�
	void breathe(); //abstract�� interface���� ���� �����ϴ�
}//interface end

//�������̽��� �ٸ� Ŭ������ �θ����� �ַ��Ѵ�
//�ݵ�� �߻�޼ҵ带 ������(override)�ؾ��Ѵ�

class Elephant2 implements Animal2{

	@Override
	public void kind() {
		System.out.println("������");
	}

	@Override
	public void breathe() {
		System.out.println("����");
	}
	
}//class end

class Tuna2 implements Animal2{
	@Override
	public void breathe() {
		System.out.println("���");
	}
	@Override
	public void kind() {
		System.out.println("�ư���");
	}
}//class end



public class Test08_interface {
	public static void main(String[] args) {
		//�������̽�(Interface)
		//->�߻�޼ҵ常 �����ϴ�
		//->�߻�Ŭ�������� �� �߻�ȭ �Ǿ� �ִ�
		//implements
		//->Ŭ������ �������̽��� ���(����) �޾Ƽ� ����Ѵ�.
//------------------------------------------------------
		//�������̽��� ��ü������ �� ����.
		//Animal2 ani=new Animal2();
		
		//�������̽��� ������
		Animal2 ani = new Elephant2();
		ani.kind();
		ani.breathe();
		
		ani=new Tuna2();
		ani.kind();
		ani.breathe();
		
		
		
	}//main() end
}//class end
