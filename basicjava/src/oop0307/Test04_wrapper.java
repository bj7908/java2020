package oop0307;

public class Test04_wrapper {

	public static void main(String[] args) {
		//Wrapper Ŭ����
		//->��κ� java.lang �⺻ ��Ű������ ����
		//->�⺻�ڷ����� ������ȭ �� ���� Ŭ�������� ��Ī
		//�⺻��(boolean byte short int long float double char)
		//������(Boolean Byte Short Integer Long Float Double Character)
		
		boolean bool = true;
		
		Boolean bool2 = new Boolean(false);
		Boolean bool3 = new Boolean("true");
		System.out.println(bool2.toString());//"false"
		
		byte by1 = 3;
		Byte by2 = new Byte("5");
		System.out.println(by2.doubleValue());//5.0
		
		int inte1 = 7;
		Integer inte2 = new Integer(9);
		Integer inte3 = new Integer("9");
		System.out.println(inte2.longValue());//9L
		System.out.println(Integer.toBinaryString(10));//2������ȯ
		System.out.println(Integer.toOctalString(10)); //8������ȯ
		System.out.println(Integer.toHexString(10));   //16������ȯ
		System.out.println(Integer.parseInt("10"));	   //String -> int ��ȯ
		
		Long l1 = new Long(3);
		Double do1 = new Double(1.2);
		Character ch1 = new Character('R');
		
		//is~~~ : �¾�? Ʋ��? (true/false�� ���� ���� ��������)
		//to~~~ 
		//get~~~ : ���� (��κ� ���ϰ��� ����)
		//set~~~ : 
		
		System.out.println(Character.isAlphabetic(65));
		System.out.println(Character.toLowerCase('R'));
		
		//'3'->3
		System.out.println(Character.getNumericValue('3'));
		
		
		
	}//main() end
}//class end
