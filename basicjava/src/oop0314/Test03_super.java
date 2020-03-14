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
		//1) private 속성이 아닐때
		//super.one=a;
		//super.tow=b;
		
		//2)부모생성자 함수호출
		super(a, b);
		this.three = c; //this.나의멤버변수
		
	}
	
	
}//class end






public class Test03_super {
	public static void main(String[] args) {
		//부모로부터 물려받은 필드에 값을 전달해야 하는 경우
		//super를 활용한다

		Child child = new Child(40, 50 ,60);
		System.out.println(child.three);
		System.out.println(child.two);
		System.out.println(child.one);
	}//main() end
}//class end
