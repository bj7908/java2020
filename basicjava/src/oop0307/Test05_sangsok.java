package oop0307;
/*
final class AA{}//종단클래스는 후손을 가질 수 없다
class BB entends AA{} 에러
*/

class AA{
	private void zero() {}
	public void one() {
		System.out.println("AA.one()...");
	}
	public void two() {
		System.out.println("AA.two()...");
	}
}//class end

class BB extends AA{ //자식(BB) extends 부모(AA)
	public void three() {
		System.out.println("BB.three()...");
	}
}//class end

class CC extends BB{
	public void four() {
		System.out.println("CC.four()...");
	}
}//class end

/*
class DD{}
class EE extends AA, DD{} //에러
//클래스간의 상속은 단일상속만 가능하다.
*/


public class Test05_sangsok {

	public static void main(String[] args) {
		//상속(inheritance)
		//->자원의 재활용
		//->부모, 조상, super
		//->자식, 후손, sub, 파생
		//extends(확장)
		//implements(구현)
		
		//형식)class 자식클래스 extends 부모클래스()
		
		AA aa= new AA();
		aa.one();
		aa.two();
		//aa.zero(); ->private속성은 클래스내부 접근만 허용
		System.out.println("------------------------");
		
		BB bb = new BB();
		bb.one();
		bb.two();
		bb.three();
		//bb.zero(); 에러. private속성은 상속 안됨
		System.out.println("------------------------");
		
		CC cc = new CC();
		cc.one();
		cc.two();
		cc.three();
		cc.four();
		
		
		
	}//main() end

}//class end
