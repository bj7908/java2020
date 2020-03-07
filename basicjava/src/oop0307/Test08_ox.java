package oop0307;

public class Test08_ox {
	public static void main(String[] args) {
		//[예제] 성적프로그램 OX 표시하기
		//Jumsu클래스 생성한 후 작성
		
		//한사람
		//Jumsu student = new Jumsu(1,"kim",3,2,3,3,5);
		//student.compute();
		//student.disp();
		
		//5명
		Jumsu[] student = {
				new Jumsu(1,"Kim",3,3,3,3,5),
				new Jumsu(2,"Lee",2,3,3,3,5),
				new Jumsu(3,"Dong",1,2,3,3,4),
				new Jumsu(4,"Pack",4,2,1,3,5),
				new Jumsu(5,"kim",3,3,3,3,3)
		};
		
		//1)5명 점수계산
		for(int i=0 ; i<student.length ; i++) {
			student[i].compute();
		}
		//2)점수(score)를 기준으로 등수(rank)구하기
		for(int i=0 ; i<student.length ; i++) {
			//System.out.println(student[i].score);
			for(int j=0 ; j<student.length ; j++) {
				if(student[i].score < student[j].score) {
					student[i].rank = student[i].rank+1;
				}
				
			}
		}
		//3)5명의 성적 출력하기
		for(int i=0 ; i<student.length ; i++) {
			student[i].disp();
		}
		
	}//main() end
}//class end
