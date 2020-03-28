package oop0328;
//implements 다중상속 가능 
//extends 다중상속 불가능
//->그래서 implements를 쓴다
class MyThread3 implements Runnable {
	//클래스의 부모가 인터페이스 implements
	//인터페이스는 다중구현이 가능하다.
	//인터페이스 : 추상메소드로만 구서오디어 있다.
	//추상클래스 : 일반메소드와 추상메소드 혼합 가능하다.
	//추상메소드 : 함수의 기능{}이 없다. (미완성 메소드)
	
	private int num;
	private String name;
	public MyThread3() {}
	public MyThread3(int num, String name) {
		this.num = num;
		this.name =name;
	}
	
	//반드시 추상메소드를 오버라이드 해야한다.
	@Override
	public void run() {
		for(int i=0 ; i<num ; i++) {
			System.out.println(name+":"+i);
		}
	}
	
}

public class Test03_thread {
	public static void main(String[] args) {
		// Runnable인터페이스를 이용한 쓰레드 구현
/*
	interfaceRunnable{}
	class Thread implements Runnable{}
	class MyThread implements Runnable{}
	
	Runnable target= new MyThread3() //다형성
 */
		Thread t1 = new Thread(new MyThread3(1000,"★"));
		Thread t2 = new Thread(new MyThread3(1000,"☆"));
		Thread t3 = new Thread(new MyThread3(1000,"＠"));
	
		t1.start();
		t2.start();
		t3.start();
		
		
	}//main() end
}//class end
