package oop0307;

class Sungjuk{
	//멤버변수
	String name;
	int kor, eng, mat;
	int aver;
	//생성자 함수
	public Sungjuk() { //기본생성자 함수 default constructor
		this("무궁화"); //자신의 생성자함수를 호출할때
	}
	public Sungjuk(String name) {}
	public Sungjuk(int kor, int eng, int mat) {
		this("무궁화");
		this.aver=(kor+eng+mat)/3;
		//this("무궁화"); 에러
		//->생성자함수를 호출하는경우 첫줄에서 호출한다.
	}
	
	public Sungjuk(String name, int kor, int eng, int mat) {
		calc(); //일반메소드 호출할 수 있다.
	}
	//멤버함수(method)
	public void calc() {
		//this("홍길동",10,20,30); 	//에러
									//일반 메소드에서 생성자함수를 호출할 수 없다.
	}
} //class end

public class Test03_this {

	public static void main(String[] args) {
		//생성자함수 호출 관계
		//this()
		//->생성자함수가 자신의 생성자함수를 호출할때
		
		
	}//main() end
}//class end
