package oop0321;

class Test{
	//1)�� �Լ����� ����ó���� ���
	/*
	public static void view() {
		try {
			int a=3/0;
		}catch (Exception e) {}//try end
	}//view() end
	public static void disp() {
		try {
			int a=Integer.parseInt("KOREA");
		}catch (Exception e) {}//try end
	}//disp() end
	*/
	
	//2)�� �Լ����� ���ܰ� �߻��̵Ǹ� �Լ��� ȣ���� ������ ���ܸ� ������
	public static void view() throws Exception{
		int a=3/0;
	}
	public static void disp() throws NumberFormatException{
		int a=Integer.parseInt("KOREA");
	}
	
	//������ ���� �߻��� �Ǵ� �޼ҵ忡 ������ �߻��� �Ǹ� 
	//OS�� �����ؼ� ������ �ذ��� �� �ֵ��� ������
	public synchronized void login() {}
	
	
}//class end


public class Test02_throws {
	public static void main(String[] args) {
		//throws��
		//->�޼ҵ忡�� ���Ǹ�
		//->���ܸ� �Ѳ����� ��Ƽ� ó���Ѵ�
		try {
			Test.view();
			Test.disp();
		}catch (Exception e) {
			//throws�� ���� ���ܴ� �Լ� ȣ������� catch�� ����
			System.out.println(e);
		}
		
		
	}//main() end
}//class end
