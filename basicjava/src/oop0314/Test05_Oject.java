package oop0314;

class Print{
	//static : 클래스명.멤버변수
	//         클래스명.멤버함수()
	//public static void wiew(Integer a) {}
	//public static void wiew(Double a) {}
	//public static void wiew(String a) {}
	public static void view(Object obj) {
		System.out.println(obj.toString());
	}
	
	public static Object disp1() {
		return new Integer(5);
	}
	public static Object disp2() {
		return new Double(3.5);
	}
	public static Object disp3() {
		return "KOREA";
	}
}//class end



public class Test05_Oject {

	public static void main(String[] args) {
		//Object클래스와 다형성
		
		//1)메소드의 매개변수가 object인 경우
		Print.view(new Integer(3));
		Print.view(new Double(2.4));
		Print.view("KOREA");
		Print.view(new Busan());
		
		//2)메소드의 리턴형이 Object인 경우
		Integer inte = (Integer) Print.disp1();
		Double dou = (Double) Print.disp2();
		String str = (String) Print.disp3();
		
		System.out.println(inte);
		System.out.println(dou);
		System.out.println(str);
		
		
		
		
		
		
	}//main() end
}//class end
