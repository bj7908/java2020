package oop0307;

public class Jumsu {
	//멤버변수(field)
	private int no;						//번호
	private String name;				//이름
	private int[] answer =new int[5];	//답안제출
	private char[] ox =new char[5];		//OX표시
	public int score;					//점수
	public int rank;					//등수
	
	//생성자함수(constructor)
	public Jumsu() {}
	public Jumsu(int no, String name, int a0,int a1, int a2, int a3, int a4) {
		this.no = no;
		this.name = name;
		this.answer[0] = a0;
		this.answer[1] = a1;
		this.answer[2] = a2;
		this.answer[3] = a3;
		this.answer[4] = a4;
		this.rank = 1;
	}
 
	//멤버함수(method)
	public void compute() {
		int[] dap = {3,3,3,3,3};//정답
		//정답과 제출한 답안(answer)을 비교해서
		//OX를 표시하고(ox), 맞은 갯수에 따라 점수구하기(score)
		
		for(int i=0 ; i<dap.length ; i++) {
			this.ox[i] = dap[i] == answer[i] ? 'O' : 'X';
			//점수 구하기
			if(this.ox[i] == 'O') {
				score= score+20;
			}
		}
		
	}//conpute() end
	
	
	public void disp() { //출력하기
		System.out.print(no+" ");
		System.out.print(name+" ");
		for(int i=0; i<this.ox.length ; i++) {
			System.out.print(this.ox[i]+" ");
		}
		System.out.print(this.score+" ");
		System.out.print(rank);
		System.out.println();
	}//disp() end
	
}//class end
