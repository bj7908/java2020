package oop0222;

class Score{
	private String name="코로나";
	private int kor, eng, mat;
	private int aver;
	
	
	
	//생성자함수가 오버로딩이 되면 기본생성자함수는
	//자동으로 생서오디지 않는다
	//기본 생성자함수는 강제적으로 추가할것을 추천!!
	public Score() {}
	public Score(String n) {
		name =n;
	}
	public Score(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public Score(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public void disp() {
		String name ="박지성";     //지역변수(local variable)
		System.out.println(name); //지역변수의 우선순위가 가장 높다
								  //->박지성
		System.out.println(this.name);//->코로나
	}//disp() end
	
	
}//class end
	
	




public class Test03_this {

	public static void main(String[] args) {
		// this
		//->클래스 자신을 가르키는 대명사
		//->멤버변수(field)와 일반변수(매개변수, 지역변수)와 구분하기 위해
		
		
		//기본생성자함수가 자동으로 인식되지 않는 경우->오버로딩
		//new Score("무궁화");
		//new Score();
		
		Score one = new Score();
		one.disp();
		
	}//main() end

}//class end
