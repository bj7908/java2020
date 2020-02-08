package oop0208;

import java.util.Calendar;

public class Test06_quiz {

	public static void main(String[] args) {
		//주민번호를 이용해서 나이와 성별을 구하시오.
		int myYear = 19; //태어난 년도
		int code = 4;  	 //성별 코드
		
		int Year;		 //올해 나이
		
		//1) 나이 : 올해년도 - 태어난 년도
		if(code == 1 || code == 2) {
			Year = 1900+myYear-1;
			System.out.print("현재 나이: "+(2020-Year)+", ");
		}else {
			Year = 2000+myYear-1;
			System.out.print("현재 나이: "+(2020-Year)+", ");
		}//if end
		
		
		//2) 성별
		//if(code == 1 || code == 3) {
		if(code%2 != 0) {
			System.out.println("성별 : 남자");
		}else {
			System.out.println("성별 : 여자");
		}
		switch(code){
			case 1: 
			case 3: System.out.println("남자"); break;
			case 2: 
			case 4: System.out.println("여자"); break;
		}
		System.out.println();
	}//main() end
}//class end
