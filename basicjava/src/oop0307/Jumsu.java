package oop0307;

public class Jumsu {
	//�������(field)
	private int no;						//��ȣ
	private String name;				//�̸�
	private int[] answer =new int[5];	//�������
	private char[] ox =new char[5];		//OXǥ��
	public int score;					//����
	public int rank;					//���
	
	//�������Լ�(constructor)
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
 
	//����Լ�(method)
	public void compute() {
		int[] dap = {3,3,3,3,3};//����
		//����� ������ ���(answer)�� ���ؼ�
		//OX�� ǥ���ϰ�(ox), ���� ������ ���� �������ϱ�(score)
		
		for(int i=0 ; i<dap.length ; i++) {
			this.ox[i] = dap[i] == answer[i] ? 'O' : 'X';
			//���� ���ϱ�
			if(this.ox[i] == 'O') {
				score= score+20;
			}
		}
		
	}//conpute() end
	
	
	public void disp() { //����ϱ�
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
