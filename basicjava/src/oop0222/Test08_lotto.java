package oop0222;

import java.util.Arrays;

public class Test08_lotto {

	public static void main(String[] args) {
		//�ζǹ�ȣ: 1~45�߿��� ��ġ�� �ʰ� 6�� �߻�
		int[] lotto = new int[6];
		int size= lotto.length;
		
		for(int i=0 ; i<size ; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(int b = 0 ; b<i; b++) {
				if(lotto[i] == lotto[b]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0 ; i<size ; i++) {
			System.out.print(lotto[i]+" ");
		}
		
		System.out.println();
		//����(Sort)
		//->�������� ascending 1->10 A->Z a->z
		//->�������� descending 
		
		//�ζǹ�ȣ 6���� ������������ ����
		Arrays.sort(lotto);
		for(int i=0 ; i<size ; i++) {
			System.out.print(lotto[i]+" ");	
		}
		
	}

}
