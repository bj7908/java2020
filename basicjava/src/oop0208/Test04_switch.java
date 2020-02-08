package oop0208;

public class Test04_switch {

	public static void main(String[] args) {
		//switch ~ case
		//실수값은 안된다.(경우에 수가 많이서 소수점을 원하는 만큼만 찍고 계산해야함)
		//->경우수의 목록중에서 수행
		//->제시하는 값과 일치하는 경우 수행
		//->실수값은 사용불가
		//break:switch~case문을 빠져나옴
		
		
		//case 목록값은 순차적이지 않아도 된다. (하지만 가독성을 위해 순차적으로 하면 좋다.)
		switch(30) {
			case 10: System.out.println("SEOUL"); break;
			case 20: System.out.println("JEJU"); break;
			case 30: System.out.println("BUSAN"); break;
			//default : System.out.println("x"); break;
		}//switch end
		System.out.println();
		
		//break가 없는 경우
		switch(20) {
			case 10: System.out.println("SEOUL"); break;
			case 20: System.out.println("JEJU");
			case 30: System.out.println("BUSAN"); break;
			//default : System.out.println("x"); break;
		}//switch end
		System.out.println();
		
		switch(40) {
		case 10: System.out.println("SEOUL"); break;
			case 20: System.out.println("JEJU"); break;
			case 30: System.out.println("BUSAN"); break;
			default : System.out.println("ETC.."); break;
		}//switch end
		System.out.println();
		
		//-----------------------------------------------------------------
		int kor=100, eng=100, mat=35;
		int aver=(kor+eng+mat)/3;
		System.out.println(aver);
		//평균점수가 90점이상 A학점
		//		  80점이상 B학점
		//		  70점이상 C학점
		//		  60점이상 D학점
		//		    나머지 F학점
		switch(aver/10) {
			case 10:
			case 9: System.out.println("A학점"); break;
			case 8: System.out.println("B학점"); break;
			case 7: System.out.println("C학점"); break;
			case 6: System.out.println("D학점"); break;
			default: System.out.println("F학점"); break;
		}//switch end
		System.out.println();
		//------------------------------------------------------------------
		//문제) 연산자 종류에 따른 계산 결과를 출력하시오.
		/*
			출력결과
			5+3=8
			5-3=2
			5*3=15
			5/3=0.6
		*/
		int a=5, b=3;
		char op = '/';
		
		int res1 = 0;		//계산결과(정수형)
		double res2 =0.0;	//계산결과(실수형)
		
		switch(op) {
		case '+' : res1 = a+b; break;
		case '-' : res1 = a-b; break;
		case '*' : res1 = a*b; break;
		case '/' : res2 = (float)a/b; break;
		}//switch end
		if(op == '/') {
			System.out.println(a+""+op+""+b+"="+res2);
		}else {
			System.out.println(a+""+op+""+b+"="+res1);
		}//if end
		
//		switch(op) {
//			case '+': System.out.println(a+"+"+b+"="+(a+b));
//				break;
//			case '-': System.out.println(a+"-"+b+"="+(a-b));
//				break;			
//			case '*': System.out.println(a+"*"+b+"="+(a*b));
//				break;
//			case '/': System.out.println(a+"/"+b+"="+((float)a/b));
//				break;
//		}//switch
		System.out.println();
		
		
		
		
	}//main() end

}//class end
