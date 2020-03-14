package oop0314;

import java.lang.*; //자바의 기본 팩키지
					//생략할 수 있다

class Korea extends Object{ //extends Object 생략할 수 있다
	String name="대한민국";
	public void disp() {
		System.out.println(name);
	}
}//class end

class Seoul extends Korea{
	String name="서울특별시";
	@Override
	public void disp() {
		System.out.println(name);
	}
	@Override
	public String toString() {
		return "[name=" + name + "]";
	}
}//class end

class Busan extends Korea{
	private String name="부산광역시";
	private String addr="대한민국 남해";
	
	//코딩시 에러 체크하는 용도로 많이 활용
	//toString()메소드 자동추가 할 수 있음
	//Source->Generate toString()..
	@Override
	public String toString() {
		return "Busan [name=" + name + ", addr=" + addr + "]";
	}
	
}//class end

public class Test01_Object extends Object{
	public static void main(String[] args) {
		//object 클래스
		//->자바의 최고 조상 클래스
		//->java.lang 팩키지에 선언 되어 있음
		//->자바의 모든 클래스는 Object클래스의 후손들이다.(O)
		
		Seoul se = new Seoul();
		se.disp();
		//se.toString();
		System.out.println(se.toString());
		System.out.println(se); //toString()메소드명을 생략하면서 호출 가능하다.
		
		Busan bu =new Busan();
		System.out.println(bu.toString());
		System.out.println(bu);
		
		
	}//main() end
}//class end
