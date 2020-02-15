package oop0215;

public class Test01_array {

	public static void main(String[] args) {
		//Array 배열
		//->동일한 자료형의 값을 한개의 변수에 1개이상을 저장할 수 있다.
		//->배열의 순서(index)는 0부터 시작해서 1씩 증가한다.
		//->배열의 각 요소 : element
		//->new연산자 : 메모리 할당 연산자
		//-> 1차원 배열 : [열]      열, column, 칸
		//-> 2차원 배열 : [행][열]   행, row, 줄
		//-> 3차원 배열 : 자바에는 없음
		
	//-----------------------------------------------------
		//1) 1차원 배열
		int[] kor = new int[3]; //4byte*3개 = 12byte 메모리에 할당됨
		kor[0] = 10;
		kor[1] = 20;
		kor[2] = 30;
		
		System.out.println(kor[0]);
		System.out.println(kor[1]);
		System.out.println(kor[2]);
		
		System.out.println(kor.length);//3 length-> 배열 요소(element)의 갯수
		System.out.println();
		
	//------------------------------------------------------
		int[] kor2 = {40, 50 ,60};
		
		for(int i=0 ; i<kor2.length ; i++) {
			System.out.println(kor2[i]);
		}
		
		System.out.println(kor2.length);
		System.out.println();
		
		//System.out.println(kor2[3]); 
		//ArrayIndexOutOfBoundsException 발생
		//3번째 요소값은 존재하지 않음
		
	//-------------------------------------------------------
		String[] name = {"무궁화","진달래","라일락"};
		for(int i=0; i<name.length ; i++) {
			System.out.println(name[i]);
		}
		System.out.println();
	//-------------------------------------------------------
		double[] height = {165.2, 180.6 ,175.9};
		for(int i=0; i<height.length ; i++) {
			System.out.println(height[i]);
		}
		System.out.println();
	//-------------------------------------------------------
		char[] ch = {'S','K','Y'};
		for(int i=0; i<ch.length ; i++) {
			System.out.println(ch[i]);
		}
		System.out.println();
		
	}//main() end

}//class end
