package oop0314;

class Parent extends Object{
	int one=10, two=20;
	public Parent() {}
	public Parent(int x, int y) {
		this.one=x;
		this.two=y;
	}
	
	
}//class end

class Child extends Parent{
	int three=30;
	public Child() {
		super();
	}
	public Child(int a, int b, int c) {
		//1) private �Ӽ��� �ƴҶ�
		//super.one=a;
		//super.tow=b;
		
		//2)�θ������ �Լ�ȣ��
		super(a, b);
		this.three = c; //this.���Ǹ������
		
	}
	
	
}//class end






public class Test03_super {
	public static void main(String[] args) {
		//�θ�κ��� �������� �ʵ忡 ���� �����ؾ� �ϴ� ���
		//super�� Ȱ���Ѵ�

		Child child = new Child(40, 50 ,60);
		System.out.println(child.three);
		System.out.println(child.two);
		System.out.println(child.one);
	}//main() end
}//class end
