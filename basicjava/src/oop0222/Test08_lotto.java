package oop0222;

import java.util.Arrays;

public class Test08_lotto {

	public static void main(String[] args) {
		//로또번호: 1~45중에서 겹치지 않게 6개 발생
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
		//정렬(Sort)
		//->오름차순 ascending 1->10 A->Z a->z
		//->내림차순 descending 
		
		//로또번호 6개를 오름차순으로 정렬
		Arrays.sort(lotto);
		for(int i=0 ; i<size ; i++) {
			System.out.print(lotto[i]+" ");	
		}
		
	}

}
