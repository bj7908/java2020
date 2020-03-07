package oop0307;

class BbsDTO{
	private int bbsno;		//번호
	private String writer;	//작성자
	private int passwd;		//비밀번호
	
	public BbsDTO() {}
	
	//private속성의 멤버변수는 대부분 멤버함수를 통해서 접근한다.
	public int getBbsno() {
		return this.bbsno;
	}
	public void setBbsno(int bbsno) {
		this.bbsno = bbsno;
	}
	public String getWriter() {return this.writer;}
	public void setWriter(String writer) {this.writer = writer;}
	public int getPasswd() {return this.passwd;}
	public void setPasswd(int passwd) {this.passwd = passwd;}
	
}//class end

class MemberDTO{
	private int memberno;
	private String id;
	private String pw;
	private String name;
	private String address;
	
	public MemberDTO() {}

	public int getMemberno() {
		return memberno;
	}

	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}//class end



public class Test09_getset {

	public static void main(String[] args) {
		//getter , setter 함수
		//함수명 규칙
		//->get 필드 첫글자 대문자 구성() : getter
		//->set 필드 첫글자 대문자 구성() : setter
		
		BbsDTO dto = new BbsDTO();
		dto.setBbsno(1);
		dto.setWriter("무궁화");
		dto.setPasswd(1234);
		
		System.out.println(dto.getBbsno());
		System.out.println(dto.getWriter());
		System.out.println(dto.getPasswd());
		
//------------------------------------------------------------
		//getter와 setter함수를 자동추가 가능
		//메뉴 -> Source -> Generate Getters and Setters...
		//->MemberDTO클래스로 테스트
		
		
		
		
	}//main() end
}//class end
