package oop0215;

public class Test02_array {

	public static void main(String[] args) {
		//1���� �迭 ��������

		char[] ch = {'E','z','e','n'};
		
		//��)������ ������ ���Ͻÿ�.(A,E,I,O,U | a,e,i,o,u)
		int moNum=0;
		for(int i=0 ; i<ch.length; i++) {
			//�ѱ��ڸ� �����ͼ�
			char c = ch[i];
			//�빮���̸� �ҹ��ڷ� ġȯ
			if(c>='A' && c<='Z') { //'A' = 65 , 'a' = 97
				c = (char)(c+32);
			}//if end
			
			//��������?
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				moNum++;
			}//if end
			
		}//for end
		System.out.println(moNum);
		
		
		//���� ������ ���
		char[] mo = {'A','E','I','O','U','a','e','i','o','u'};
		int count = 0;
		
		for(int i=0 ; i<mo.length ; i++) {
			for(int j=0 ; j<ch.length ; j++) {
				if(mo[i]==ch[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
		System.out.println();
	//------------------------------------------------------------
		int[] num = {8,-9,5,7,3};
		
		//��)������ ������ ���Ͻÿ�.
		int numCount = 0;
		for(int i=0 ; i<num.length ; i++) {
			if(num[i]<0) {
				numCount++;
			}//if end
		}//for end
		System.out.println("������ ������ "+numCount);
		
		//��)����� Ȧ���� ���� ���Ͻÿ�
		int num2 = 0;
		for(int i=0 ; i<num.length ; i++) {
			if(num[i]%2 == 1) {
				num2 += num[i];
			}//if end
		}//for end
		System.out.println("����� Ȧ���� ���� "+num2);
		//System.out.println(-9%2);
		System.out.println();
		
		//��)num[2]�� ����� ���Ͻÿ�.
		int num3 = 0;
		for(int i=0 ; i<num.length ; i++) {
			if(num[2]<=num[i]) {
				num3++;
			}//if end
		}//for end
		System.out.println(num[2]+"�� ����� "+num3);
		System.out.println();
		
		//��)num�迭 ����� ������ ����� ���Ͻÿ�.
		int[] rank = {0,0,0,0,0};
		for(int i=0 ; i<num.length ; i++) {
			for(int j=0 ; j<rank.length ; j++) {
				if(num[i]<=num[j]) {
					rank[i]++;
				}
			}//for end
			System.out.println(num[i]+"�� ����� "+rank[i]);
		}//for end
		
		
		
		
		
	}//main() end
}//class end
