package oop0222;//<-현재 클래스의 저장위치
				//<-package는 한번만 선언

//클래스의 저장위치 선언
//import는 여러번 선언 가능
import java.io.*;
import java.util.*;
import java.sql.*;

class Sungjuk{ //package class Sungjuk
			   //->package 생략해야만 한다.
	//식별자
	//->프로젝트명 : basicjava
	//->팩키지명 : oop0222
	//->클래스명 : Sungjuk 클래스명은 첫글자는 주로 대문자로 한다
	//->변수명, 함수명, 객체명
	
	//Access Modifier 접근제어, 접근수정, 접근지정
	//->private   : 비공개. 클래스내부에서만 접근가능
	//->package   : 현재package내에서만 접근 가능. 생략한 경우 기본값
	//->protected : 상속관계에 있는  클래스가 다른package에 존재하는 경우에만 접근 가능
	//->public    : 공개. basicjava프로젝트 내에서 모두 접근 가능
	
	
	//클래스내부에서는 (Access Modifier)접근제어와 상관없이 접근 가능하다.
	//멤버변수 field
	public String name;
	int kor,eng,mat; //package 생략해야만 함.
	private int aver;
	
	
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
	
	private void view() {}//vied() end
	
	
	
	
	
} //class end
//------------------------------------------------------------------------

public class Test01_class {

	public static void main(String[] args) {
		//class 클래스
		//->참조자료형
		//->사용자 정의 자료형
		//->구성멤버 : 멤버변수(field) + 멤버함수(method)
		//->클래스는 메모리를 (램에) 할당하고 사용(new 연산자) : 객체(object)
		//객체선언형식 : new  생성자함수()
		
		int a = 3; //a는 일반변수
		
		//new Sungjuk(); //객체 Object
		   				 //RAM의 heap공간 #50번지에 메모리 확보
		
		//sj 참조변수(reference)변수
		Sungjuk sj = new Sungjuk();
		//참조변수를 통해 객체에 접근하는 연산자 : . 연산자
		sj.name = "홍길동"; //public 속성은 접근가능
		sj.kor = 100;     //package속성 접근 가능
		sj.eng = 50;
		sj.mat = 75;
		//sj.aver 에러 . private 속성은 접근 불가능
		System.out.println(sj.name);
		System.out.println(sj.kor);
		System.out.println(sj.eng);
		System.out.println(sj.mat);
		
		sj.calc();
		sj.disp();
		//sj.view() 에러 . private속성은 접근 불가능
//-----------------------------------------------------------------------
		//클래스명 참조변수 = 객체(Object)
		Sungjuk sungjuk = new Sungjuk();
		sungjuk.name = "김연아";
		sungjuk.kor = 70;
		sungjuk.eng = 85;
		sungjuk.mat = 60;
		sungjuk.calc();
		sungjuk.disp();
		
//------------------------------------------------------------------------
		//참조변수가 가지고 있는 객체의 주소값
		System.out.println(sj.hashCode());		//#50번지
		System.out.println(sungjuk.hashCode()); //#60번지
		
		Sungjuk tmp = sj;
		System.out.println(tmp.hashCode());     //#50번지
//------------------------------------------------------------------------
		
		
		
	}//main() end

}//class end
