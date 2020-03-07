package oop0307;

class School{
	public String name="�б�";
	public final void view() {
		System.out.println("School.view()...");
	}//view() end
	public void disp() {
		System.out.println("School.disp()..."+this.name);
	}//disp() end
	
}//class end

class MiddleSchool extends School{
	//1)�������̵� �ϱ� ��
	
}//class end

class HighSchool extends School{
	//2)�������̵� �� ��
	String name="����б�";
	
	/*
	@Override
	public void view() {} //final�޼ҵ�� �������̵� �Ҽ� ����.
	*/
	
	@Override
	public void disp() {
		System.out.println("HighSchool.disp()"+name);
	}
	
}//class end





public class test07_override {

	public static void main(String[] args) {
		//�޼ҵ� ������(method Override)
		//->�������� �޼ҵ带 �ٽ� �ۼ�(����)
		
		//1)�������̵� �ϱ� ��
		MiddleSchool ms = new MiddleSchool();
		System.out.println(ms.name);//�б�
		ms.disp(); //School.disp()...�б�
		
		//2)�������̵� �� ��
		HighSchool hs = new HighSchool();
		System.out.println(hs.name); //����б�
		hs.disp();//School.disp()����б�
		
		
	}//main() end
}//class end
