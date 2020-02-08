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
		int kor=100, eng=100, mat=35;
		
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
			System.out.println("국어: 합격");
		}else {
			System.out.println("국어: 불합격");
		}//if end
		
		//수학점수가 90점이상 A학점
		//		  80점이상 B학점
		//		  70점이상 C학점
		//		  60점이상 D학점
		//		    나머지 F학점
		
		if(mat >= 90) {
			System.out.println("수학: A학점");
		}else if(mat >= 80) {
			System.out.println("수학: B학점");
		}else if(mat >= 70) {
			System.out.println("수학: C학점");
		}else if(mat >= 60) {
			System.out.println("수학: D학점");
		}else {
			System.out.println("수학: F학점");
		}
		System.out.println();
		//---------------------------------------------
		//과락
		//평균이 70점이상이면 합격
		//(단, 국영수중에서 한과목이라도 40점 미만 재시험)
		//아니면 불합격
		if(aver >= 70) {
			//or조건으로 풀었을때,
//			if(kor<40 || eng<40 || mat<40) {
//				System.out.println("재시험");
//			}else {
//				System.out.println("합격");
//			}//if end
			//and조건으로 풀었을때,
			if(kor<=40 && eng >=40 && mat>=40) {
				System.out.println("합격");
			}else {
				System.out.println("재시험");
			}
		}else {
			System.out.println("불합격");
		}//if end
		
		
		
	}//main() end

}//class end
