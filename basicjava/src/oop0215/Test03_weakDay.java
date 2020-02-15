package oop0215;

public class Test03_weakDay {

	public static void main(String[] args) {
		// 요일 구하는 프로그램
		int cYear = 2020, cMonth=2, cDate=15;
		
	/*
	 [서기 1년 1월 1일] ~ [서기 2020년 2월 15일 까지의 총 날수 = ? 
	  총날수%7 -> 0:일, 1:월, 2:화, 3:수, 4:목, 5:금, 6:토
    */
	
	//1)단계 : 서기 1년~ 서기 2019년 
    //  윤년 += 366
    //  평년 += 365
		
		int hap=0; //총 날수의 합
		for(int y=1 ; y<cYear ; y++) {
			if(y%4==0 && y%100!=0 || y%400==0) {
				hap = hap+366;
			}else {
				hap = hap+365;
			}//if end
		}//for end
		//System.out.println(hap);
  
	//2)단계 : 1월~ 1월
    //  1, 3, 5, 7, 8, 10 ,12 : 31
	//  4, 6, 9 , 11          : 30
	//  2                     : 29(윤년)
	//  2                     : 28(평년)
		
		int[] month1 = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		//윤년 물어보기
		if(cYear%4==0 && cYear%100!=0 || cYear%400==0) {
			month1[2] = 29;
		}
		for(int m=1 ; m<cMonth ; m++) {
			hap = hap+month1[m];
		}//for end
		
	//3)단계 : 일을 더해준다.	
		hap=hap+cDate;
		System.out.println(hap);
		
	//4)단계 : 요일을 구해준다.
		String day ="";
		switch(hap%7) {
			case 0 : day = "일"; break;
			case 1 : day = "월"; break;
			case 2 : day = "화"; break;
			case 3 : day = "수"; break;
			case 4 : day = "목"; break;
			case 5 : day = "금"; break;
			case 6 : day = "토"; break;
//			case 0 : System.out.println("일요일"); break;
//			case 1 : System.out.println("월요일"); break;
//			case 2 : System.out.println("화요일"); break;
//			case 3 : System.out.println("수요일"); break;
//			case 4 : System.out.println("목요일"); break;
//			case 5 : System.out.println("금요일"); break;
//			case 6 : System.out.println("토요일"); break;
		}
		System.out.println(day);
		
	}//main() end
}//class end
