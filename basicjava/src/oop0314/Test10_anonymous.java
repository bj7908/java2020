package oop0314;

interface IMessage{
	public void msgprint(); //추상메소드
}//interface end


public class Test10_anonymous {

	public static void main(String[] args) {
		//익명 내부 클래스 Anonymous class
		//->이름이 없는 클래스 형태들
		//->필요한 곳에서 일시적으로 사용
		
		//인터페이스는 new 할 수 없다
		//IMessage msg = new IMessage(); //에러
		
		
		//추상메소드를 재정의하면 일시적으로 객체생성할수 있다
		//jQuery, Android JAVA등 이벤트가 발생할 때만 주로 사용하는 패턴
		/*jQuery문법에서 이벤트 처리
		 * $("button").click(function(){
		 * });
		*/
		IMessage msg = new IMessage() { //익명 내부 클래스
			@Override
			public void msgprint() {
				System.out.println("INessage.magPrint()");
			}
		};
		
		msg.msgprint();
		
	}//main() end
}//class end
