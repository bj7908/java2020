package oop0208;

public class Test08_quiz {

	public static void main(String[] args) {
		// for���� ����
		//��)������ 9��
		for(int i = 2 ; i<=9 ; i++) {
			for(int j = 1 ; j<=9 ; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}//for end
		}//for end
		System.out.println();
		
		//------------------------------------------------
		//����, ����
		//��)1~5 ������ ���� ���� ���Ͻÿ�.
		int hap = 0;
		for(int num = 1 ; num <= 5 ; num++) {
			hap += num;
		}//for end
		System.out.println(hap);
		System.out.println();
		//-------------------------------------------------
		//��)4���丮���� ���Ͻÿ�
		//-> 4*3*2*1
		long gop = 1;
		for(int f=4 ; f>=1 ;f=f-1) {
			gop = gop * f;
		}//for end
		System.out.println(gop);
		System.out.println();
		//-------------------------------------------------
		//��)1~5�߿��� ¦���� ������ ���Ͽ���
		int num1 = 0;
		for(int i = 1 ; i<=5 ; i++) {
			if(i%2 == 0) {
				num1++;
			}
		}
		System.out.println(num1);
		System.out.println();
		
		//---------------------------------------------------
		//��)�μ������� ���� ���Ͻÿ�
		//int start=2, end=5;
		int start=5, end=2;
		
		//start���� end������ ũ��, �κ����� ���� ���� ��ȯ(swap)
		int tmp;
		tmp = start;
		start = end;
		end = tmp;
		
		int sum=0;
		for (int a=start ; a <=end ; a++) {
			sum = sum+a;
		}//for end
		System.out.println(sum);
		System.out.println();
		
	}// main() end

}// class end
