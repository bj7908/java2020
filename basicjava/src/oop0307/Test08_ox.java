package oop0307;

public class Test08_ox {
	public static void main(String[] args) {
		//[����] �������α׷� OX ǥ���ϱ�
		//JumsuŬ���� ������ �� �ۼ�
		
		//�ѻ��
		//Jumsu student = new Jumsu(1,"kim",3,2,3,3,5);
		//student.compute();
		//student.disp();
		
		//5��
		Jumsu[] student = {
				new Jumsu(1,"Kim",3,3,3,3,5),
				new Jumsu(2,"Lee",2,3,3,3,5),
				new Jumsu(3,"Dong",1,2,3,3,4),
				new Jumsu(4,"Pack",4,2,1,3,5),
				new Jumsu(5,"kim",3,3,3,3,3)
		};
		
		//1)5�� �������
		for(int i=0 ; i<student.length ; i++) {
			student[i].compute();
		}
		//2)����(score)�� �������� ���(rank)���ϱ�
		for(int i=0 ; i<student.length ; i++) {
			//System.out.println(student[i].score);
			for(int j=0 ; j<student.length ; j++) {
				if(student[i].score < student[j].score) {
					student[i].rank = student[i].rank+1;
				}
				
			}
		}
		//3)5���� ���� ����ϱ�
		for(int i=0 ; i<student.length ; i++) {
			student[i].disp();
		}
		
	}//main() end
}//class end
