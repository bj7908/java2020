package oop0208;

public class Test03_conversion {

	public static void main(String[] args) {
		// �ڷ��� ��ȯ DataType Conversion
				
		//1)������ ��ȯ(cast������)
		//->�ʿ��� ������ �Ͻ����� ��ȯ
		//->(�ڷ���)��
		System.out.println((int)1.3);
		System.out.println((int)2.4+(int)3.7);
		
		System.out.println((int)(2.4+3.7));
		System.out.println();
		
		System.out.println(5);
		System.out.println((double)5);
		System.out.println(5.0);
		System.out.println(5.);
		System.out.println();
		//�̷��� ������ ���� ����!
		System.out.println(3/5); 		 //���������� ������ �������� ���´�.
		System.out.println(3/5.0);		 //���� �ϳ��� �Ǽ������� �ؼ� �ڵ� ����ȯ�� �ǰ� �Ѵ�.
		System.out.println(3.0/5);
		System.out.println((double)3/5); //������ ��ȯ ���
		System.out.println();
		//------------------------------------------------
		//2)�ڵ� ����ȯ
		//������ : byte < short < int < long
		//�Ǽ��� : float < double
		
		byte a = 2;
		int b = a;  //a����(byte��)�� �ڵ����� int������ ����ȯ
		long c = b; //b������(int��) �ڵ����� long������ ����ȯ
		//a = c; ���� -> longŸ���� byte�� �������� �ؼ� ������ ��
		
		float d = 3.4f;
		double e = d;
		//--------------------------------------------------
		
		System.out.println(65);
		System.out.println((char)65); //'A'
		System.out.println((char)66); //'B'
		System.out.println((char)67); //'C'
		System.out.println();
		
		System.out.println('a');
		System.out.println((int)'a'); //�ƽ�Ű�ڵ�(ASCII)�� ��ȯ
		System.out.println((int)'b');
		System.out.println((int)'c');
		System.out.println();
		
		System.out.println('A'<'a');
		System.out.println();
		//ASCII�ڵ尪�� �����ϹǷ�
		//int���� char���� ������ ��ȯ�� �����ϴ�.
		System.out.println((int)'+');	//43
		System.out.println((int)' ');	//32
		System.out.println((int)'\r');	//13
		
	}//main() end

}//class end
