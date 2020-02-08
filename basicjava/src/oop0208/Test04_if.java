package oop0208;

public class Test04_if {

	public static void main(String[] args) {
		//제어문
		//->프로그램의 흐름을 제어
		//->조건문 : if,if-else,if-else if, switch ~ case
		//->반목문 : for, while, do~while
		//break
		//continue
		
		//------------------------------------------------
		//성적 프로그램
		String name ="무궁화";
		int kor=90, eng=100, mat=100;
		
		//평균구하기
		int aver=(kor+eng+mat)/3;
		
		//출력
		System.out.println("이름: "+name);
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+mat);
		System.out.println("평균: "+aver);
		System.out.println();
		
		//평균이 95점 이상이면 장학생
		if(aver >= 95) {
			System.out.println(name+"학생은 장학생입니다.");
		}//if end
		
		//국어점수(kor)가 70점 이상이면 합격, 아니면 불합격 
		if(kor >= 70) { 
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}//main() end

}//class end
