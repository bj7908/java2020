package oop0307;

class GrandFa{
	public GrandFa() {
		System.out.println("GrandFa()...");
	}//GrandFa() end
}//class end

class Father extends GrandFa {
	public Father() {
		System.out.println("Father()...");
	}//Father() end
}//class end

class Son extends Father{
	public Son() {
		System.out.println("Son()...");
	}
}//class end

public class Test06_constructor {

	public static void main(String[] args) {
		//��Ӱ��迡���� ������ �Լ� ȣ�� ����
		//->�θ� �������Լ� ȣ���� �ڽ��� ������ �Լ��� ȣ��ȴ�.
		
		//GrandFa() -> Father()
		Father father = new Father();
		System.out.println("----------------------------------");
		
		//GrandFa() -> Father() -> Son()
		Son son = new Son();
		System.out.println("----------------------------------");
		
		
	}//main() end
}//class end
