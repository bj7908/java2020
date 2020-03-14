package oop0314;

interface Animal2{
	//void view() {}; 일반메소드 사용불가
	abstract void kind(); //추상메소드만 가능하다
	void breathe(); //abstract는 interface에서 생략 가능하다
}//interface end

//인터페이스는 다른 클래스의 부모역할을 주로한다
//반드시 추상메소드를 재정의(override)해야한다

class Elephant2 implements Animal2{

	@Override
	public void kind() {
		System.out.println("포유류");
	}

	@Override
	public void breathe() {
		System.out.println("허파");
	}
	
}//class end

class Tuna2 implements Animal2{
	@Override
	public void breathe() {
		System.out.println("어류");
	}
	@Override
	public void kind() {
		System.out.println("아가미");
	}
}//class end



public class Test08_interface {
	public static void main(String[] args) {
		//인터페이스(Interface)
		//->추상메소드만 가능하다
		//->추상클래스보다 더 추상화 되어 있다
		//implements
		//->클래스가 인터페이스를 상속(구현) 받아서 사용한다.
//------------------------------------------------------
		//인터페이스는 객체생성할 수 없다.
		//Animal2 ani=new Animal2();
		
		//인터페이스의 다형성
		Animal2 ani = new Elephant2();
		ani.kind();
		ani.breathe();
		
		ani=new Tuna2();
		ani.kind();
		ani.breathe();
		
		
		
	}//main() end
}//class end
