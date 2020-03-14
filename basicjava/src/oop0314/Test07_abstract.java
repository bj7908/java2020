package oop0314;

abstract class Travel{
	void line() {
		System.out.println("-----------------------");
	}
	abstract String travelWhere(); //�߻�޼ҵ�
}//class end

class TypeA extends Travel{
	@Override
	String travelWhere() {
		return "���ֵ� �÷���";
	}
}//class end
class TypeB extends Travel{
	@Override
	String travelWhere() {
		return "���ǵ� �Ҳ�����";
	}
}//class end
class TypeC extends Travel{
	@Override
	String travelWhere() {
		return "�Ȼ� ���̵�";
	}
}//class end

public class Test07_abstract {

	public static void main(String[] args) {
		//�߻�Ŭ����
		Travel tour = new TypeA();
		System.out.println(tour.travelWhere());
		tour.line();
		
		tour = new TypeB();
		System.out.println(tour.travelWhere());
		tour.line();
		
		tour = new TypeC();
		System.out.println(tour.travelWhere());
		tour.line();
	}
}
