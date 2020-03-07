package oop0307;

class Sawon{ //package 접근제어 생략
	//멤버변수(field)
	String sabun; //사원번호
	String name;  //이름
	int pay;      //급여
	
	//생성자함수(constructor):클래스명과 동일한 함수
	public Sawon() {} //default constructor 기본생성자
	public Sawon(String sabun, String name, int pay) {
		this.sabun = sabun;
		this.name = name;
		this.pay = pay;
	}//함수 중복 정의 (overloading)
	
	//static변수
	static String COMPANY="(주)이젠";
	static double TAX=0.03;
	static int SUDANG=10;
	//static 함수
	static void line() {
		System.out.println("----------------------------");
	}
	
	
	
}//class end

public class test01_static {

	public static void main(String[] args) {
		//static 연습
		//-> 정적
		//-> 함수, 변수
		//접근방법 : 클래스명.함수()
		//         클래스명.변수
		
		//System.out.println(Math.PI);
		//System.out.println(Math.abs(-3));
		
//--------------------------------------------------
		//클래스(참조 자료형)는 메모리할당을 해야한다.
		//->new 생성자 함수()
		//->객체(Object)
		//->객체는 RAM의 heap영역에 할당된다.
		
		Sawon one=new Sawon("1001","개나리",100);// one참조변수
		//세금 = 급여 *0.03
		int myTax= (int)(one.pay*one.TAX);
		//총지급액 : (급여+수당)-세금
		int total=(one.pay+one.SUDANG)-myTax;
		System.out.println("회사: "+one.COMPANY);
		System.out.println("사원번호: "+one.sabun);
		System.out.println("이름: "+one.name);
		System.out.println("월급: "+one.pay);
		System.out.println("수당: "+one.SUDANG);
		System.out.println("총 지급액"+total);
		one.line();
//-------------------------------------------------
		//2)static의 특징이 반영된 경우
		//static변수와 함수는 이미 static메모리공간에
		//값이 올라와 있기 때문에 별도의 객체 생성없이도 접근 가능하다.
		Sawon two=new Sawon("2001","진달래",200);// one참조변수
		myTax = (int)(two.pay*Sawon.TAX);
		total = (one.pay+Sawon.SUDANG)-myTax;
		System.out.println("회사: "+Sawon.COMPANY);
		System.out.println("사원번호: "+two.sabun);
		System.out.println("이름: "+two.name);
		System.out.println("월급: "+two.pay);
		System.out.println("수당: "+Sawon.SUDANG);
		System.out.println("총 지급액"+total);
		Sawon.line();
		
//-------------------------------------------------
		//static변수의 연산
		//->static변수는 생성도 1번, 소멸도 1번 된다.
		//->static변수의 연산은 계속 이어진다(continue)
		//->static변수의 주소가 공유된다.
		
		Sawon kim = new Sawon("3001","김땡땡",300);
		Sawon lee = new Sawon("4001","이땡땡",400);
		
		kim.pay = kim.pay+1;//301
		lee.pay = lee.pay+2;//402
		
		System.out.println(kim.pay);
		System.out.println(lee.pay);
		
		kim.SUDANG = kim.SUDANG+1;//11
		System.out.println(kim.SUDANG);
		lee.SUDANG = lee.SUDANG+1;//12
		System.out.println(lee.SUDANG);
		
		Sawon.SUDANG = Sawon.SUDANG+1;
		System.out.println(Sawon.SUDANG);//13
		System.out.println(kim.SUDANG);//13
		System.out.println(lee.SUDANG);//13
		
		
	}//main() end
}//class end
