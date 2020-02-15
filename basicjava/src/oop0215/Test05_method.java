package oop0215;

public class Test05_method {
	
	//멤소드 작성영역(멤버함수)
	
	//함수정의(작성)
	//void : 리턴값이 없다
	public static void test1() {
		System.out.println("JAVA");
	}//test1() end
	
	public static void test2() {
		System.out.println("KOREA");
		return; //함수를 호출한 시점으로 되돌아 간다
				//마지막 return은 생략가능
	}//test2() end
	
	public static void test3(int a) { //a는 매개변수(parameter)
		System.out.println(a);
	}//test3() end
	
	public static void test4(int a,int b,int c) {
		//매개변수 선언시 자료형은 생략할수 없다.
		System.out.println(a+b+c);
	}//test4()end
	
	public static void test5(double a,double b) {
		//매개변수 선언시 자료형은 생략할수 없다.
		System.out.println(a+b);
	}//test5()end
	
	public static void test6(char ch ,int a) {
		
		for(int i = 0 ; i<a; i++) {
			System.out.print(ch);	
		}
	}//test6() end
	public static void main(String[] args) {
		// Method 메소드 ★★★★★
		//->함수, function , procedure
		//->일정한 기능을 갖고 있음
		//식별자 : 프로젝트명 basicjava
		//      팩키지명      oop0215
		//      클래스명    Test05_method
		//      변수명, 함수명 등등
		//함수는 ()가 붙고, 변수는 ()가 안붙는다.
		//함수 작성시 고려사항 : 매개변수(parameter), 리턴값
		//->함수를 선언(정의)하는 형식 : 리턴형 함수명(){}
		//함수를 작성하고, 함수를 호출함으로써 실행된다.
		
		
		//1) 전달값(argument value)이 없는 경우
		//함수 호출
		test1();
		test1();
		test1();
		
		test2();
//----------------------------------------------------------
		//5		 int형
		//5L     long형
		//1.2    double형
		//1.2d   double형(접미사 d 생략가능)
		//1.2f	 float형
//----------------------------------------------------------		
		//2)전달값이 있는 경우
		test3(10);
		test3(20);
		test3(40);
		
		test4(7,8,9);
		
		test5(1.2, 3.4);
		test5(3.5, 4.4);
		
		test6('#', 13);
	}//main() end
}//class
