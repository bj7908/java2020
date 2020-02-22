package oop0222;


class School{
	//멤버변수(field)
	//private속성을 활용하여 특정멤버를 은폐할수 있다.
	private String name;
	private int kor,eng, mat;
	private int aver;
	
	//생성자 함수
	//->클래스명과 동일한 함수
	//-> 함수의 리턴형이 존재하지 않는다.
	//public void School() {} 주의!!
	public School() { //기본생성자 default constructor
					  //자동 생성 된다
		System.out.println("School()...");
		
		
	}//School() end
	
	//생성자함수도 오버로딩(함수명 중복정의)이 가능하다.
	public School(String n) { //매개변수 parameter
		name=n; //맴버변수
	}
	
	public School(int k, int e, int m) {
		kor = k;
		eng = e;
		mat = m;
	}
	
	public School(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		mat = m;
	}

	//멤버함수 method
	public void calc() {
		aver = (kor+eng+mat)/3;
	} //calc() end
	
	void disp() { //package 접근제어 생략되어 있음.
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
		
	}//disp() end
	
	
}//class end


public class Test02_constructor {

	public static void main(String[] args) {
		// Constructor 생성자 함수 
		//->new연산자와 함께 메모리 할당할때 사용
		//->클래스 명과 동일한 함수(생성자 함수)
		//->오버로딩이 가능
		
		// Destructor 소멸자 함수 (C언어에서는 해줘야 한다)
		//->자바에는 없음!!
		//->Garbage Collecting : JVM이 자동으로 메모리 회수랄 함
		
		
		//메모리 할당할때 생성자함수를 호출한다.
		new School();
		School one = new School("홍길동");
		School two = new School(1,2,3);
		School three = new School("홍길동",1,2,3);
		
		one.calc(); one.disp();
		two.calc(); two.disp();
		three.calc(); three.disp();
		
		//System.out.println(one);
		//System.out.println(two);
		//System.out.println(three);
		
		//null 없는값
		School four = null;
		
		
		
		
	}//main()end

}//class end
