package oop0314;

abstract class Animal{ //추상클래스
	String name;
	void view() { //일반 메소드
		System.out.println("Animal.view()...");
	} 
	
	abstract void disp(); //추상메소드
}//class end

//추상클래스는 주로 부모크랠스 역할만 한다
class Elephant extends Animal{
	//추상클래스를 상속받으면 반드시 추상메소드를 재정의 (override)해야 한다.
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
		//추상클래스 Abstract Class
		//->미완성
		//->추상메소드가 한개라도 잇으면 추상클래스
		//->추상메소드 : 함수의 기능{}이 없는 메소드
		//->추상메소드 선언형식 : 리턴형 함수();
		//->추상메소드와 일반메소드가 같이 선언될수 있다
		
		//인터페이스 Interface
		//->추상메소드만 가능하다
//------------------------------------------------------------
		
		//추상클래스는 객체 생성할 수 없다
		//Animal ani=new Animal();
		//추상클래스는 누군가의 부모역할로 많이 활용한다
		
		Elephant jumbo=new Elephant();
		jumbo.view();
		jumbo.disp();
		
		Tuna nemo = new Tuna();
		nemo.view();
		nemo.disp();
		
//-------------------------------------------------------------
		//추상클래스의 다형성
		
		Animal ani=new Elephant();
		ani.disp();
		
		ani=new Tuna();
		ani.disp();
		
		
	}//main() end
}//class end
