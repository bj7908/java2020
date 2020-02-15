package oop0215;

public class Test06_method {

	
	public static int test1(int a, int b) {
		int sum=a+b;
		return sum;//리턴값은 1개값만 리턴된다.
				   //리턴값의 자료형을 void자리에 쓴다.
	}//test1() end
	
	
	
	public static String test2(int a) {
		if(a%2 == 0) {
			return "짝수";
		}else {
			return "홀수";
		}//if end
	}//test2() end
	
	public static boolean leap(int Year) {
		if(Year%4 == 0 && Year%100 != 0 || Year%400 == 0) {
			return true;
		}else{
			return false;
		}//if end
		
	}
	
	public static long fact(int a) {
		long num = 1;
		for(int i=a ; i>=1 ; i--) {
			num = num*i;
		}//for end
		return num;
	}//fact() end
	
	public static void main(String[] args) {
		// 리턴값이 있는 경우
		int result = test1(3,5);
		System.out.println(result);
		System.out.println(test1(2,5));
		
		String str = test2(6);
		System.out.println(str);
		System.out.println(test2(7));
		
		if(leap(2020)) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}//if end
		
		//4팩토리얼값 반환 (4*3*2*1);
		long gop = fact(4);
		System.out.println(gop);
		
		
		
		
	}//main() end

}//class end
