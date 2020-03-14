package oop0314;

abstract class Travel{
	void line() {
		System.out.println("-----------------------");
	}
	abstract String travelWhere(); //추상메소드
}//class end

class TypeA extends Travel{
	@Override
	String travelWhere() {
		return "제주도 올레길";
	}
}//class end
class TypeB extends Travel{
	@Override
	String travelWhere() {
		return "여의도 불꽃축제";
	}
}//class end
class TypeC extends Travel{
	@Override
	String travelWhere() {
		return "안산 오이도";
	}
}//class end

public class Test07_abstract {

	public static void main(String[] args) {
		//추상클래스
		Travel tour = new TypeA();
		System.out.println(tour.travelWhere());
		tour.line();
		
		tour = new TypeB();
		System.out.println(tour.travelWhere());
		tour.line();
		
		tour = new TypeC();
		System.out.println(tour.travelWhere());
		tour.line();
	}
}
