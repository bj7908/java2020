package oop0215;

public class Test07_method {

	public static void test() {
		test();//�ڽ��� �Լ��� ȣ���� �� �ִ�.
	}//test() end
	
	public static long fact(int a) {
		if(a==0) {
			return 1;
		}else {
			return a*fact(a-1);
		}
	}//fact() end
	
	public static void main(String[] args) {
		//����� �Լ� ȣ��
		//->�ڽ��� �ڽ��� �Լ��� ȣ���� �� �ִ�.
		
		System.out.println(fact(3));

	}//main() end

}//class end
