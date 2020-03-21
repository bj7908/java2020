package oop0321;

class Test{
	//1)각 함수에서 예외처리한 경우
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
	
	//2)각 함수에서 예외가 발생이되면 함수를 호출한 곳으로 예외를 던진다
	public static void view() throws Exception{
		int a=3/0;
	}
	public static void disp() throws NumberFormatException{
		int a=Integer.parseInt("KOREA");
	}
	
	//공유가 많이 발생이 되는 메소드에 문제가 발생이 되면 
	//OS가 개입해서 문제를 해결할 수 있도록 도와줌
	public synchronized void login() {}
	
	
}//class end


public class Test02_throws {
	public static void main(String[] args) {
		//throws문
		//->메소드에서 사용되며
		//->예외를 한꺼번에 모아서 처리한다
		try {
			Test.view();
			Test.disp();
		}catch (Exception e) {
			//throws로 던진 예외는 함수 호출시점의 catch가 받음
			System.out.println(e);
		}
		
		
	}//main() end
}//class end
