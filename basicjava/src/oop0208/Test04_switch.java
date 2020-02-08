package oop0208;

public class Test04_switch {

	public static void main(String[] args) {
		//switch ~ case
		//�Ǽ����� �ȵȴ�.(��쿡 ���� ���̼� �Ҽ����� ���ϴ� ��ŭ�� ��� ����ؾ���)
		//->������ ����߿��� ����
		//->�����ϴ� ���� ��ġ�ϴ� ��� ����
		//->�Ǽ����� ���Ұ�
		//break:switch~case���� ��������
		
		
		//case ��ϰ��� ���������� �ʾƵ� �ȴ�. (������ �������� ���� ���������� �ϸ� ����.)
		switch(30) {
			case 10: System.out.println("SEOUL"); break;
			case 20: System.out.println("JEJU"); break;
			case 30: System.out.println("BUSAN"); break;
			//default : System.out.println("x"); break;
		}//switch end
		System.out.println();
		
		//break�� ���� ���
		switch(20) {
			case 10: System.out.println("SEOUL"); break;
			case 20: System.out.println("JEJU");
			case 30: System.out.println("BUSAN"); break;
			//default : System.out.println("x"); break;
		}//switch end
		System.out.println();
		
		switch(40) {
		case 10: System.out.println("SEOUL"); break;
			case 20: System.out.println("JEJU"); break;
			case 30: System.out.println("BUSAN"); break;
			default : System.out.println("ETC.."); break;
		}//switch end
		System.out.println();
		
		//-----------------------------------------------------------------
		int kor=100, eng=100, mat=35;
		int aver=(kor+eng+mat)/3;
		System.out.println(aver);
		//��������� 90���̻� A����
		//		  80���̻� B����
		//		  70���̻� C����
		//		  60���̻� D����
		//		    ������ F����
		switch(aver/10) {
			case 10:
			case 9: System.out.println("A����"); break;
			case 8: System.out.println("B����"); break;
			case 7: System.out.println("C����"); break;
			case 6: System.out.println("D����"); break;
			default: System.out.println("F����"); break;
		}//switch end
		System.out.println();
		//------------------------------------------------------------------
		//����) ������ ������ ���� ��� ����� ����Ͻÿ�.
		/*
			��°��
			5+3=8
			5-3=2
			5*3=15
			5/3=0.6
		*/
		int a=5, b=3;
		char op = '/';
		
		int res1 = 0;		//�����(������)
		double res2 =0.0;	//�����(�Ǽ���)
		
		switch(op) {
		case '+' : res1 = a+b; break;
		case '-' : res1 = a-b; break;
		case '*' : res1 = a*b; break;
		case '/' : res2 = (float)a/b; break;
		}//switch end
		if(op == '/') {
			System.out.println(a+""+op+""+b+"="+res2);
		}else {
			System.out.println(a+""+op+""+b+"="+res1);
		}//if end
		
//		switch(op) {
//			case '+': System.out.println(a+"+"+b+"="+(a+b));
//				break;
//			case '-': System.out.println(a+"-"+b+"="+(a-b));
//				break;			
//			case '*': System.out.println(a+"*"+b+"="+(a*b));
//				break;
//			case '/': System.out.println(a+"/"+b+"="+((float)a/b));
//				break;
//		}//switch
		System.out.println();
		
		
		
		
	}//main() end

}//class end
