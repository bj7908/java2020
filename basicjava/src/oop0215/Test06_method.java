package oop0215;

public class Test06_method {

	
	public static int test1(int a, int b) {
		int sum=a+b;
		return sum;//���ϰ��� 1������ ���ϵȴ�.
				   //���ϰ��� �ڷ����� void�ڸ��� ����.
	}//test1() end
	
	
	
	public static String test2(int a) {
		if(a%2 == 0) {
			return "¦��";
		}else {
			return "Ȧ��";
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
		// ���ϰ��� �ִ� ���
		int result = test1(3,5);
		System.out.println(result);
		System.out.println(test1(2,5));
		
		String str = test2(6);
		System.out.println(str);
		System.out.println(test2(7));
		
		if(leap(2020)) {
			System.out.println("����");
		}else {
			System.out.println("���");
		}//if end
		
		//4���丮�� ��ȯ (4*3*2*1);
		long gop = fact(4);
		System.out.println(gop);
		
		
		
		
	}//main() end

}//class end
