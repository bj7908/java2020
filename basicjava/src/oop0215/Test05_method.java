package oop0215;

public class Test05_method {
	
	//��ҵ� �ۼ�����(����Լ�)
	
	//�Լ�����(�ۼ�)
	//void : ���ϰ��� ����
	public static void test1() {
		System.out.println("JAVA");
	}//test1() end
	
	public static void test2() {
		System.out.println("KOREA");
		return; //�Լ��� ȣ���� �������� �ǵ��� ����
				//������ return�� ��������
	}//test2() end
	
	public static void test3(int a) { //a�� �Ű�����(parameter)
		System.out.println(a);
	}//test3() end
	
	public static void test4(int a,int b,int c) {
		//�Ű����� ����� �ڷ����� �����Ҽ� ����.
		System.out.println(a+b+c);
	}//test4()end
	
	public static void test5(double a,double b) {
		//�Ű����� ����� �ڷ����� �����Ҽ� ����.
		System.out.println(a+b);
	}//test5()end
	
	public static void test6(char ch ,int a) {
		
		for(int i = 0 ; i<a; i++) {
			System.out.print(ch);	
		}
	}//test6() end
	public static void main(String[] args) {
		// Method �޼ҵ� �ڡڡڡڡ�
		//->�Լ�, function , procedure
		//->������ ����� ���� ����
		//�ĺ��� : ������Ʈ�� basicjava
		//      ��Ű����      oop0215
		//      Ŭ������    Test05_method
		//      ������, �Լ��� ���
		//�Լ��� ()�� �ٰ�, ������ ()�� �Ⱥٴ´�.
		//�Լ� �ۼ��� ������� : �Ű�����(parameter), ���ϰ�
		//->�Լ��� ����(����)�ϴ� ���� : ������ �Լ���(){}
		//�Լ��� �ۼ��ϰ�, �Լ��� ȣ�������ν� ����ȴ�.
		
		
		//1) ���ް�(argument value)�� ���� ���
		//�Լ� ȣ��
		test1();
		test1();
		test1();
		
		test2();
//----------------------------------------------------------
		//5		 int��
		//5L     long��
		//1.2    double��
		//1.2d   double��(���̻� d ��������)
		//1.2f	 float��
//----------------------------------------------------------		
		//2)���ް��� �ִ� ���
		test3(10);
		test3(20);
		test3(40);
		
		test4(7,8,9);
		
		test5(1.2, 3.4);
		test5(3.5, 4.4);
		
		test6('#', 13);
	}//main() end
}//class
