package oop0215;

public class Test04_array {

	public static void main(String[] args) {
		// 2차원 배월 : [행][열]
		
		//2행 3열
		int[][] kor = new int[2][3]; //4byte*6개 = 24byte
		kor[0][0] =10;
		kor[0][1] =20;
		kor[0][2] =30;
		kor[1][0] =40;
		kor[1][1] =50;
		kor[1][2] =60;
		
		//2차원 배열의 행의 갯수
		System.out.println("2차원 배열의 행의 갯수"+kor.length);
		//kor[0]행의 열의 갯수
		System.out.println("kor[0]행의 열의 갯수"+kor[0].length);
		//kor[1]행의 열의 갯수
		System.out.println("kor[1]행의 열의 갯수"+kor[1].length);
		
		for(int i=0 ; i<kor.length;i++) {
			for(int j=0 ; j<kor[i].length; j++) {
				System.out.print(kor[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
//----------------------------------------------------------------------
		int[][] kor2 = {
				{10,20,30,40,50},
				{60,70},
				{80,90,11}
		};
		
		System.out.println("2차원 배열의 행의 갯수"+kor2.length);
		System.out.println("kor2[0]행의 열의 갯수"+kor2[0].length);
		System.out.println("kor2[1]행의 열의 갯수"+kor2[1].length);
		System.out.println("kor2[2]행의 열의 갯수"+kor2[2].length);
		System.out.println();
		
		for(int i=0 ; i<kor2.length;i++) {
			for(int j=0 ; j<kor2[i].length; j++) {
				System.out.print(kor2[i][j]+" ");
			}//for end
			System.out.println();
		}//for end
		System.out.println("---------------------");
		
		
	}//main() end
}//class end
