package oop0215;

public class Test10_overload {

	public static void hap(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void hap(int a) {
		System.out.println(a);
	}
	
	public static void hap(double a , double b) {
		System.out.println(a+b);
	}
	
	public static void hap(String a, String b) {
		System.out.println(a+b);
	}
	
	/*에러,
	 * 함수의 리턴형은 오버로딩의 대상이 아니다.
	 * public static int hap(String a , String b ) {
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		//Method Overload 함수 중복 정의
		//-> 함수명을 중복해서 선언할 수 있다.
		//메소드 오버로딩의 전제조건
		//->매개변수의 갯수가 달라야 한다.
		//->매개변수의 자료형이 달라야 한다.
		
		hap(1);
		hap(1,3);
		hap(1.2,2);
		hap("Java","script");
		
		//절대값
		System.out.println(Math.abs(2));
		System.out.println(Math.abs(2L));
		System.out.println(Math.abs(2.4d));
		System.out.println(Math.abs(2.3f));
		
	}//main() end
}//class end
