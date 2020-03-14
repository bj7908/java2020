package oop0314;

import oop0314.WebPragram.Language;

class WebPragram{ //.jsp .php .asp
				  //.py
	String title = "JAVA Programming";
	class Language{
		String basic="JAVA,HTML,HavaScript";
		public void display() {
			System.out.println("기초 수업: "+basic);
		}
	}//inner class
	class Smart{
		String basic = "Object-C, JAVA, C#";
		public void display() {
			System.out.println("기초 수업: "+basic);
		}
	} //inner class
	
	public void print() {
		Language lang =new Language();
		lang.display();
		Smart sm = new Smart();
		sm.display();
	}	
}//class end

//구글사에서 만든 모바일 전용 플랫폼(OS) : 안드로이드
//안드로이드OS의 자바문법에서 구조적으로 지원하는 클래스
class R{
	static class id{
		public static String btn="버튼";
	}
}//class end


//구글사에서 만든 객체지형 문법 : GO
//오라클 자바 Oracle Java
//무료 자바 Open JDK



public class Test11_inner {

	public static void main(String[] args) {
		//내부클래스 inner class
		//클래스안에 클래스를 선언할 수 있다
		
		WebPragram web = new WebPragram();
		web.print();
		
		//내부클래스는 외부에서 직접 접글할수 없다
		//Language lang = new Language(); //에러
		//Smart sm = new Smart();//에러
		
		//내부클래스를 접근하는 경우 단계적으로 접근하면 된다
		WebPragram.Language lang = new WebPragram().new Language();
		lang.display();
		WebPragram.Smart smart = new WebPragram().new Smart();
		smart.display();
//-------------------------------------------------------------		
		
		//id 내부클래스 접근
		System.out.println(R.id.btn);
		
	}
}
