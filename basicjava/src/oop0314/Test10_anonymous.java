package oop0314;

interface IMessage{
	public void msgprint(); //�߻�޼ҵ�
}//interface end


public class Test10_anonymous {

	public static void main(String[] args) {
		//�͸� ���� Ŭ���� Anonymous class
		//->�̸��� ���� Ŭ���� ���µ�
		//->�ʿ��� ������ �Ͻ������� ���
		
		//�������̽��� new �� �� ����
		//IMessage msg = new IMessage(); //����
		
		
		//�߻�޼ҵ带 �������ϸ� �Ͻ������� ��ü�����Ҽ� �ִ�
		//jQuery, Android JAVA�� �̺�Ʈ�� �߻��� ���� �ַ� ����ϴ� ����
		/*jQuery�������� �̺�Ʈ ó��
		 * $("button").click(function(){
		 * });
		*/
		IMessage msg = new IMessage() { //�͸� ���� Ŭ����
			@Override
			public void msgprint() {
				System.out.println("INessage.magPrint()");
			}
		};
		
		msg.msgprint();
		
	}//main() end
}//class end
