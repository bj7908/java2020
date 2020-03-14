package oop0314;

import java.util.Calendar;
import java.util.GregorianCalendar;

class Father extends Object{
	public String name="아버지";
	public String addr="주소";
	
	public Father() {}
	public Father(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}
	public void disp() {
		System.out.println(this.name);
		System.out.println(this.addr);
	}
} //class end

class Son extends Father{
	public Son() {}
	public Son(String n, String a) {
		super(n,a);
	}
}//class end

class Daughter extends Father{
	String friend="절친";
	public Daughter() {}
	public Daughter(String n, String a) {
		super(n,a);
	}
}//class end

public class Test04_poly {

	public static void main(String[] args) {
		//상속관계에서의 다형성 polymorphism
		//상속 : extends(확장), implement(구현)
		//부모관점에서 형태가 여러가지
		//클래스들간에 형변환 작업이 용이함
		
		
		//다형성의 예)
		//참조변수 = 객체생성
		//GregorianCalendar now = new GregorianCalendar();
		//다형성의 관계로 객체 생성
		//Calendar today = new GregorianCalendar();
		//Object obj = new Integer(3);
//----------------------------------------------------------
		/*
		//1) 일반적인 방식의 객체 생성
		//-> new연산자를 사용
		//-> POJO(plain Old Java Object)방식
		Father fa = new Father();
		fa.disp();
		
		Son son = new Son();
		son.disp();
		*/
//----------------------------------------------------------
		/*
		//2)다형성을 아용한 객체 생성
		//->자식클래스가 부모클래스에 대입 가능하다
		//->부모클래스는 자식클래스의 모양으로 변환후 대입가능하다.
		Father father=new Son("손흥민","영국");
		father.disp();
		
		father=new Daughter("김연아","한국");
		father.disp();
		
		System.out.println(father.name);
		System.out.println(father.addr);
		//자식클래스가 새롭게 추가된 멤버는 다형성의 대상이 아니다
		//System.out.println(father.friend); //에러
		*/
//----------------------------------------------------------
		//3)부모클래스도 자식클래스에 대입할수 있다.
		//  (단, 자식의 모양으로 변환후 가능하다)
		Father father = new Father();
		Son son = new Son();
		
		//자식은 부모에 대입가능하다
		father = son;
		//부모는 자식에게 대입하기 위해선 형변환을 해야한다.
		//부모도 자식에 대입가능하지만 데이터 손실과 Exception이 발생 할 수도 있음
		son = (Son)father;
//----------------------------------------------------------
		Object obj=new Integer(3);
		Integer inte= (Integer) obj;
		
		
	}//mian() end
}//class end
