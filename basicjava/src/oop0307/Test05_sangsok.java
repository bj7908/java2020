package oop0307;
/*
final class AA{}//����Ŭ������ �ļ��� ���� �� ����
class BB entends AA{} ����
*/

class AA{
	private void zero() {}
	public void one() {
		System.out.println("AA.one()...");
	}
	public void two() {
		System.out.println("AA.two()...");
	}
}//class end

class BB extends AA{ //�ڽ�(BB) extends �θ�(AA)
	public void three() {
		System.out.println("BB.three()...");
	}
}//class end

class CC extends BB{
	public void four() {
		System.out.println("CC.four()...");
	}
}//class end

/*
class DD{}
class EE extends AA, DD{} //����
//Ŭ�������� ����� ���ϻ�Ӹ� �����ϴ�.
*/


public class Test05_sangsok {

	public static void main(String[] args) {
		//���(inheritance)
		//->�ڿ��� ��Ȱ��
		//->�θ�, ����, super
		//->�ڽ�, �ļ�, sub, �Ļ�
		//extends(Ȯ��)
		//implements(����)
		
		//����)class �ڽ�Ŭ���� extends �θ�Ŭ����()
		
		AA aa= new AA();
		aa.one();
		aa.two();
		//aa.zero(); ->private�Ӽ��� Ŭ�������� ���ٸ� ���
		System.out.println("------------------------");
		
		BB bb = new BB();
		bb.one();
		bb.two();
		bb.three();
		//bb.zero(); ����. private�Ӽ��� ��� �ȵ�
		System.out.println("------------------------");
		
		CC cc = new CC();
		cc.one();
		cc.two();
		cc.three();
		cc.four();
		
		
		
	}//main() end

}//class end
