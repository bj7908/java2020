package oop0321;

public class Test06_jumin {

	public static void main(String[] args) {
		//�ֹι�ȣ ��ȿ�� �˻�
		//Jumin Ŭ����
		Jumin id = new Jumin("9302021234569");
		if(id.validate()) {
			System.out.println("�ֹι�ȣ �¾ƿ�!");
			id.disp();
		}else {
			System.out.println("�ֹι�ȣ Ʋ����!");
		}
	}

}
