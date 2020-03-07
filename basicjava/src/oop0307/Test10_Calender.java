package oop0307;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test10_Calender {

	public static void main(String[] args) {
		//Calendar 클래스
		//날짜관련 클래스

		//시스템의 날짜관련된 정보를 가져오기
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.get(1));		//년 2020
		System.out.println(cal.get(2)+1);	//월 3
		System.out.println(cal.get(5));		//일 7
		
		System.out.println(cal.get(Calendar.YEAR)); 	//2020
		System.out.println(cal.get(Calendar.MONTH)+1); 	//3
		System.out.println(cal.get(Calendar.DATE));		//7
		
		System.out.println(cal.get(Calendar.HOUR));		//시
		System.out.println(cal.get(Calendar.MINUTE));	//분
		System.out.println(cal.get(Calendar.SECOND));	//초
		System.out.println("-------------------------------------");
		
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));	//시
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));	//요일
		
		int weekday = cal.get(Calendar.DAY_OF_WEEK);
		switch(weekday) {
			case 1 :System.out.println("일요일");break;
			case 2 :System.out.println("월요일");break;
			case 3 :System.out.println("화요일");break;
			case 4 :System.out.println("수요일");break;
			case 5 :System.out.println("목요일");break;
			case 6 :System.out.println("금요일");break;
			case 7 :System.out.println("토요일");break;
		}
//-----------------------------------------------------------------
		int cYear=2020;
		GregorianCalendar Gcal =new GregorianCalendar();
		if(Gcal.isLeapYear(cYear)){
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
		
		GregorianCalendar myBirth = new GregorianCalendar(1989,11,28);
		System.out.println(myBirth.get(Calendar.YEAR));
	}//main() end
}//class end
