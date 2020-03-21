package oop0321;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Jumin {
	private String jumin; //주민번호
	public Jumin() {}
	public Jumin(String jumin) {
		this.jumin=jumin;
	}
	
	public boolean validate() {
		boolean flag = false;
		//주민번호가 맞는지 검사를 해서,
		//주민번호가 유효하면 flag값을 true로 바꾸시오
		System.out.println("입력받은 주민번호:"+this.jumin);
		jumin = this.jumin;
		//주민번호 길이 구하기
		//System.out.println(jumin.length());
		
		//주민번호와 곱할 배열
		int[] gop =new int[]{2,3,4,5,6,7,8,9,2,3,4,5};
		//주민번호를 각가 넣을 배열 만들기
		int[] jumins = new int[jumin.length()];
		for(int i=0 ; i<jumin.length() ; i++) {
			jumins[i] = Integer.parseInt(jumin.substring(i,i+1));
		}
		//System.out.println(gop.length);
		//주민번호와 배열 곱하고 더하기
		int sumSave = 0;
		for(int i=0 ; i< gop.length ; i++) {
			int sum = jumins[i]*gop[i];
			sumSave +=sum;
			//System.out.println(jumins[i]+" "+gop[i]+" "+sum+" "+sumSave);
		}
		//공식에 대입하기
		int M = (11-sumSave%11)%10;
		System.out.println("공식으로 구한 숫자:"+M);
		
		if(jumins[jumins.length-1]==M) {
			flag = true;
		}
		
		return flag;
	}//validate() end
	
	public void disp() {
		//생년월일
		int myYear = Integer.parseInt(jumin.substring(0,2));
		int myMonth = Integer.parseInt(jumin.substring(2,4));
		int myDate = Integer.parseInt(jumin.substring(4,6));
		//성별코드
		int code =Integer.parseInt(jumin.substring(6,7));
		
		switch(code) {
		 	case 1:
		 	case 2: myYear = myYear+1900; break;
		 	case 3:
		 	case 4: myYear = myYear+2000; break;
		}
		
		//오늘 날짜 정보
		GregorianCalendar now = new GregorianCalendar();
		int cYear = now.get(Calendar.YEAR);
		
		//나이
		int myAge = cYear-myYear;
		
		//성별
		String myGender="";
		switch(code%2) {
		case 0: myGender="여자"; break;
		case 1: myGender="남자"; break;
		}
		
		//띠
		String[] animal= {"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
		
		
		System.out.println();
		System.out.println("태어난 날짜:"+myYear+"년 "+myMonth+"월 "+myDate+"일");
		System.out.println("성별:"+myGender);
		System.out.println("나이:"+myAge);
		System.out.println("띠:"+animal[myYear%12]);
		
		//살아온 날수(숙제- 태어난 날짜에서 하루식 더해서 오늘날짜까지 구하기)
	}//disp();
}
