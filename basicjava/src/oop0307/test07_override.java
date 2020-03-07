package oop0307;

class School{
	public String name="학교";
	public final void view() {
		System.out.println("School.view()...");
	}//view() end
	public void disp() {
		System.out.println("School.disp()..."+this.name);
	}//disp() end
	
}//class end

class MiddleSchool extends School{
	//1)오버라이드 하기 전
	
}//class end

class HighSchool extends School{
	//2)오버라이드 한 후
	String name="고등학교";
	
	/*
	@Override
	public void view() {} //final메소드는 오버라이드 할수 없다.
	*/
	
	@Override
	public void disp() {
		System.out.println("HighSchool.disp()"+name);
	}
	
}//class end





public class test07_override {

	public static void main(String[] args) {
		//메소드 재정의(method Override)
		//->물려받은 메소드를 다시 작성(리폼)
		
		//1)오버라이드 하기 전
		MiddleSchool ms = new MiddleSchool();
		System.out.println(ms.name);//학교
		ms.disp(); //School.disp()...학교
		
		//2)오버라이드 한 후
		HighSchool hs = new HighSchool();
		System.out.println(hs.name); //고등학교
		hs.disp();//School.disp()고등학교
		
		
	}//main() end
}//class end
