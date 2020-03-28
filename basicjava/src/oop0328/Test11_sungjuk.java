package oop0328;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Test11_sungjuk {
	public static void main(String[] args) {
		//���� ���α׷�
		//�Է����� : sungjuk.txt
		//������� : result.txt
		String inName="D:/java0201/sungjuk.txt";
		String outName="D:/java0201/result.txt";
		
		//�б���
		FileReader fr = null;
		BufferedReader br = null;
		
		//������
		FileWriter fw = null;
		PrintWriter out = null;
		
		try {
			
			//1)������ ������ �ʿ��� ���� ����
			String[] name = new String[5];
			int[] kor = new int[5];
			int[] eng = new int[5];
			int[] mat = new int[5];
			
			//2)sungjuk.txt�����͸� �����ͼ� �Է��ڷ� �ϼ�
			fr = new FileReader(inName);
			br = new BufferedReader(fr);
			
			int i=0;
			while(true) {
				String line=br.readLine();
				if(line==null) {
					break;
				}
				String[] info = line.split(",");
				name[i] = info[0];			       //"�����"
				kor[i] = Integer.parseInt(info[1]);//"90"
				eng[i] = Integer.parseInt(info[2]);//"95"
				mat[i] = Integer.parseInt(info[3]);//"100"
				
				i++;
				
			}//while end(�Է��ڷ� �ϼ�)

			//4)����� ���Ͻÿ�
			int[] aver = new int[5];
			for(int j=0 ; j<i ; j++) {
				aver[j] = (kor[j]+eng[j]+mat[j])/3;
			}
		
			//5)����� ���Ͻÿ�
			int[] rank = {1,1,1,1,1};
			for(int a=0 ; a<i ; a++) {
				for(int b=0; b<i; b++) {
					if(aver[a]<aver[b]) {
						rank[a]++;
					}
				}
			}
			
			
			
			//6)result.txt�� ��� ����ϱ�
			fw = new FileWriter(outName, false);
			out = new PrintWriter(fw,true);
			out.println("��/��/��/��");
			out.println("--------------------------------------------------------------------");
			out.println("�̸�     ���� ���� ���� ��� ��� ���");
			out.println("--------------------------------------------------------------------");
			
			for(int k=0; k<i; k++) {
				out.printf("%-4s %4d %4d %4d %4d %4d",
						name[k],kor[k],eng[k],mat[k],aver[k],rank[k]);
				out.printf("%3s", " ");
				
				//7)����Ȯ���ϱ�
				if(aver[k]>=80) {
					if(kor[k]<40||eng[k]<40||mat[k]<40) {
						out.printf("%-4s","�����");
					}else {
						out.printf("%-4s","�հ�");
					}
				}else {
					out.printf("%-4s","���հ�");
				}
				
				out.printf("%3s", " ");
				
				for(int star=0 ; star<aver[k]/10; star++) {
					out.printf("��");
				}
				
				out.println();//�ٹٲ�
			}
			
			System.out.println("result.txt ������� �ϼ�");
			
			
		}catch (Exception e) {
			System.out.println("����:"+e);
		}finally {//�ڿ��ݳ�
			try {
				if(fr != null) {fr.close();}
			}catch (Exception e) {}
			try {
				if(br != null) {br.close();}
			}catch (Exception e) {}
			try {
				if(fw != null) {fw.close();}
			}catch (Exception e) {}
			try {
				if(out != null) {out.close();}
			}catch (Exception e) {}
		}
		
		
	}//main() end
}//class end
