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
	
	/*����,
	 * �Լ��� �������� �����ε��� ����� �ƴϴ�.
	 * public static int hap(String a , String b ) {
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		//Method Overload �Լ� �ߺ� ����
		//-> �Լ����� �ߺ��ؼ� ������ �� �ִ�.
		//�޼ҵ� �����ε��� ��������
		//->�Ű������� ������ �޶�� �Ѵ�.
		//->�Ű������� �ڷ����� �޶�� �Ѵ�.
		
		hap(1);
		hap(1,3);
		hap(1.2,2);
		hap("Java","script");
		
		//���밪
		System.out.println(Math.abs(2));
		System.out.println(Math.abs(2L));
		System.out.println(Math.abs(2.4d));
		System.out.println(Math.abs(2.3f));
		
	}//main() end
}//class end
