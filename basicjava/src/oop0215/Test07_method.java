package oop0215;

public class Test07_method {

	public static void test() {
		test();//자신의 함수를 호출할 수 있다.
	}//test() end
	
	public static long fact(int a) {
		if(a==0) {
			return 1;
		}else {
			return a*fact(a-1);
		}
	}//fact() end
	
	public static void main(String[] args) {
		//재귀적 함수 호출
		//->자신이 자신의 함수를 호출할 수 있다.
		
		System.out.println(fact(3));

	}//main() end

}//class end
