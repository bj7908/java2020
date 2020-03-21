package oop0321;

import javax.crypto.NullCipher;

public class Test01_exception {
	public static void main(String[] args) {
		//����ó��(����)
		//->Ŭ���� �����Ҷ� �߻��ϴ� ����
		//->try~catch
		//->finally
		//->throws
		
		//1)����ó���� ���� ���� ���
		//->���α׷��� ���������� ������� ����
		System.out.println(1);
		//System.out.println(2/0);
		System.out.println(3);
		System.out.println("END");
		System.out.println();
//------------------------------------------------------		
		
		//2)����ó���� �� ���
		//->������ ������ ���� �ذ��ϴ°��� �߿�!!
		try {
			//Exception�� ����Ǵ� �ڵ� �ۼ�
			System.out.println(1);
			System.out.println(2/0);
			System.out.println(3);
		} catch(ArithmeticException e) { //catch(Exception�� ����)
			//Exception�� �߻��Ǹ� ó���ϴ� �ڵ� �ۼ�
			System.out.println(e);
		}//try end
		System.out.println("END");
		System.out.println();
//-------------------------------------------------------		
		//3)
		try {
			System.out.println(1);
			int[] num = new int[3];
			num[5] = 7; //exception �߻�
			System.out.println();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("END");
		System.out.println();
//--------------------------------------------------------
		//4)
		try {
			System.out.println(1);
			int a = Integer.parseInt("KOREA");
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("END");
		System.out.println();
//--------------------------------------------------------
		//5)
		try {
			System.out.println(1);
			Integer inte=null;
			int a = 3/inte;
		}catch(NullPointerException e) {
			System.out.println(e);
		}//try end
		System.out.println("END");
		System.out.println();
//---------------------------------------------------------
		//6)���� catch��
		try {
			System.out.println(1);
			Integer inte=null;
			int a=3/inte;
			System.out.println(2/0);
			int b=Integer.parseInt("KOREA");
		}catch(NullPointerException e) {
			System.out.println(e);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}//try end
		System.out.println("END");
		System.out.println();
//----------------------------------------------------------
		//7) ������
		//Exception Ŭ���� : ��� ����ó��(Exception)�� ���� Ŭ����
		try {
			System.out.println(1);
			System.out.println(2/0);
			Integer inte=null;
			int a=3/inte;
			int b=Integer.parseInt("KOREA");
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("END");
		System.out.println();
//-----------------------------------------------------------
		//8) finally��
		//->���ܰ� �߻� �ǰų� �߻����� �ʾƵ� ���� (������ ����)
		try {
			System.out.println("OPEN");
			System.out.println(1/0);
			System.out.println(2);
			
		}catch (Exception e) {
			System.out.println(e);
			
		}finally {
			System.out.println("CLOSE");
		}//try end
		System.out.println("END");
		
		
		
	}//main() end
}//class end
