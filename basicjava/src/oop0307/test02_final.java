package oop0307;

/*
final class Animal{ //����Ŭ����
		      		//->����� ��ų�� ����
}//class end  		//->�ļ�Ŭ������ ����� ����

class Elephant extends Animal{}//����
*/

class Fruit{
	void view() {}
	final void disp() {}
}//class end


class Apple extends Fruit{
	@Override		//<-annotation
					//<-��ӹ��� �Լ��� ������(����, �������̵�(override))
	void view() {}
	
	/*
	@Override		
	void disp() {}	//->����. final �޼ҵ�� override�� �� ����.
	*/
}//class end




public class test02_final {
	public static void main(String[] args) {
		//final ������
		//->����, �Լ�, class
		
		int a=3;
		a=5;
		
		final int b=2;//final ����(������ ���ȭ)
		//b=4; ����. final������ �ٸ������� ������ �� ����.
		
		
		
		
	}//main() end
}//class end
