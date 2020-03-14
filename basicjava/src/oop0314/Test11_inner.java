package oop0314;

import oop0314.WebPragram.Language;

class WebPragram{ //.jsp .php .asp
				  //.py
	String title = "JAVA Programming";
	class Language{
		String basic="JAVA,HTML,HavaScript";
		public void display() {
			System.out.println("���� ����: "+basic);
		}
	}//inner class
	class Smart{
		String basic = "Object-C, JAVA, C#";
		public void display() {
			System.out.println("���� ����: "+basic);
		}
	} //inner class
	
	public void print() {
		Language lang =new Language();
		lang.display();
		Smart sm = new Smart();
		sm.display();
	}	
}//class end

//���ۻ翡�� ���� ����� ���� �÷���(OS) : �ȵ���̵�
//�ȵ���̵�OS�� �ڹٹ������� ���������� �����ϴ� Ŭ����
class R{
	static class id{
		public static String btn="��ư";
	}
}//class end


//���ۻ翡�� ���� ��ü���� ���� : GO
//����Ŭ �ڹ� Oracle Java
//���� �ڹ� Open JDK



public class Test11_inner {

	public static void main(String[] args) {
		//����Ŭ���� inner class
		//Ŭ�����ȿ� Ŭ������ ������ �� �ִ�
		
		WebPragram web = new WebPragram();
		web.print();
		
		//����Ŭ������ �ܺο��� ���� �����Ҽ� ����
		//Language lang = new Language(); //����
		//Smart sm = new Smart();//����
		
		//����Ŭ������ �����ϴ� ��� �ܰ������� �����ϸ� �ȴ�
		WebPragram.Language lang = new WebPragram().new Language();
		lang.display();
		WebPragram.Smart smart = new WebPragram().new Smart();
		smart.display();
//-------------------------------------------------------------		
		
		//id ����Ŭ���� ����
		System.out.println(R.id.btn);
		
	}
}
