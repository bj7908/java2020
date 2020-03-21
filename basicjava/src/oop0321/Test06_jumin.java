package oop0321;

public class Test06_jumin {

	public static void main(String[] args) {
		//주민번호 유효성 검사
		//Jumin 클래스
		Jumin id = new Jumin("9302021234569");
		if(id.validate()) {
			System.out.println("주민번호 맞아요!");
			id.disp();
		}else {
			System.out.println("주민번호 틀려요!");
		}
	}

}
