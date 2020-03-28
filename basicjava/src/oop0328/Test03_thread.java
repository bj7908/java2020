package oop0328;
//implements ���߻�� ���� 
//extends ���߻�� �Ұ���
//->�׷��� implements�� ����
class MyThread3 implements Runnable {
	//Ŭ������ �θ� �������̽� implements
	//�������̽��� ���߱����� �����ϴ�.
	//�������̽� : �߻�޼ҵ�θ� ��������� �ִ�.
	//�߻�Ŭ���� : �Ϲݸ޼ҵ�� �߻�޼ҵ� ȥ�� �����ϴ�.
	//�߻�޼ҵ� : �Լ��� ���{}�� ����. (�̿ϼ� �޼ҵ�)
	
	private int num;
	private String name;
	public MyThread3() {}
	public MyThread3(int num, String name) {
		this.num = num;
		this.name =name;
	}
	
	//�ݵ�� �߻�޼ҵ带 �������̵� �ؾ��Ѵ�.
	@Override
	public void run() {
		for(int i=0 ; i<num ; i++) {
			System.out.println(name+":"+i);
		}
	}
	
}

public class Test03_thread {
	public static void main(String[] args) {
		// Runnable�������̽��� �̿��� ������ ����
/*
	interfaceRunnable{}
	class Thread implements Runnable{}
	class MyThread implements Runnable{}
	
	Runnable target= new MyThread3() //������
 */
		Thread t1 = new Thread(new MyThread3(1000,"��"));
		Thread t2 = new Thread(new MyThread3(1000,"��"));
		Thread t3 = new Thread(new MyThread3(1000,"��"));
	
		t1.start();
		t2.start();
		t3.start();
		
		
	}//main() end
}//class end
