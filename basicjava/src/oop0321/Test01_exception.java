package oop0321;

import javax.crypto.NullCipher;

public class Test01_exception {
	public static void main(String[] args) {
		//예외처리(에러)
		//->클래스 실행할때 발생하는 에러
		//->try~catch
		//->finally
		//->throws
		
		//1)예외처리를 하지 않은 경우
		//->프로그램이 정상적으로 종료되지 않음
		System.out.println(1);
		//System.out.println(2/0);
		System.out.println(3);
		System.out.println("END");
		System.out.println();
//------------------------------------------------------		
		
		//2)예외처리를 한 경우
		//->에러의 원인을 보고 해결하는것이 중요!!
		try {
			//Exception이 예상되는 코드 작성
			System.out.println(1);
			System.out.println(2/0);
			System.out.println(3);
		} catch(ArithmeticException e) { //catch(Exception의 종류)
			//Exception이 발생되면 처리하는 코드 작성
			System.out.println(e);
		}//try end
		System.out.println("END");
		System.out.println();
//-------------------------------------------------------		
		//3)
		try {
			System.out.println(1);
			int[] num = new int[3];
			num[5] = 7; //exception 발생
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
		//6)다중 catch문
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
		//7) 다형성
		//Exception 클래스 : 모든 예외처리(Exception)의 조상 클래스
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
		//8) finally문
		//->예외가 발생 되거나 발생되지 않아도 실행 (무조건 실행)
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
