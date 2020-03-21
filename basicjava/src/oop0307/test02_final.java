package oop0307;

/*
final class Animal{ //종단클래스
		      		//->상속을 시킬수 없다
}//class end  		//->후손클래스를 만들수 없다

class Elephant extends Animal{}//에러
*/

class Fruit{
	void view() {}
	final void disp() {}
}//class end


class Apple extends Fruit{
	@Override		//<-annotation
					//<-상속받은 함수를 재정의(리폼, 오버라이드(override))
	void view() {}
	
	/*
	@Override		
	void disp() {}	//->에러. final 메소드는 override할 수 없다.
	*/
}//class end




public class test02_final {
	public static void main(String[] args) {
		//final 마지막
		//->변수, 함수, class
		
		int a=3;
		a=5;
		
		final int b=2;//final 변수(변수를 상수화)
		//b=4; 에러. final변수는 다른값으로 대입할 수 없다.
		
		
		
		
	}//main() end
}//class end
