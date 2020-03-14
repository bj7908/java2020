package oop0314;

class School extends Object{
	public String name="학교";
	public School() {
		System.out.println("School()...");
	}
};//class end

class MiddleSchool extends School{
	public String name="중학교";
	public MiddleSchool() {
		//부모생성자 함수 호출 명령어 생략되어 있음
		super();
		
		System.out.println("MiddleSchool()...");
	}
}//class end

class HighSchool extends School{
	String name="고등학교";

	public HighSchool() {
		super(); //생략가능
		System.out.println("HighSchool()...");
	}
	
	public void disp() {
		String name="성포고등학교";
		System.out.println(name); 	   //지역변수: 성포고등학교
		System.out.println(this.name); //멤버변수: 고등학교
		System.out.println(super.name);//부모변수: 학교
	}
	
}//class end


public class Test02_super {
	public static void main(String[] args) {
		//조상, 부모,super
		//super   :자식클래스에서 부모클래스 멤버변수에 접근할 때 쓰임
		//super() :자식클래스의 생성자함수가 부모클래스의 생성자함수를 호출때
		
		//this    :멤버변수(field)와 지역변수를 구분하기 위해 쓰
		//this()  :자신의 생성자 함수를 호출할때
		
		//부모생성자부터 호출 -> 자신의 생성자 호출
		//School() -> MiddleSchool()
		MiddleSchool ms = new MiddleSchool();
		
		HighSchool hs = new HighSchool();
		hs.disp();
		
	}//main() end
}//class end
