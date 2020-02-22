package oop0222;

class Jumsu{
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	//기본생성자 함수 자동 추가
	//메뉴 Source -> Generate Constructors From Superclass...
	public Jumsu() {}
	
	//매개변수 있는 생성자함수 자동 코딩 추가
	//메뉴 Source -> Generate Constructor using field...
	public Jumsu(String name) {
		this.name = name;
	}

	public Jumsu(int kor, int eng, int mat, int aver) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public Jumsu(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	
}//Jumsu end



public class Test04_constructor {

	public static void main(String[] args) {
		//생성자 자동 코딩
		//기본생성자 함수 자동 추가
		//메뉴 Source -> Generate Constructors From Superclass...
		//매개변수 있는 생성자함수 자동 코딩 추가
		//메뉴 Source -> Generate Constructor using field...
		
		
	}//main() end
}//class end
