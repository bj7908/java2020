package oop0307;

class BbsDTO{
	private int bbsno;		//��ȣ
	private String writer;	//�ۼ���
	private int passwd;		//��й�ȣ
	
	public BbsDTO() {}
	
	//private�Ӽ��� ��������� ��κ� ����Լ��� ���ؼ� �����Ѵ�.
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
		//getter , setter �Լ�
		//�Լ��� ��Ģ
		//->get �ʵ� ù���� �빮�� ����() : getter
		//->set �ʵ� ù���� �빮�� ����() : setter
		
		BbsDTO dto = new BbsDTO();
		dto.setBbsno(1);
		dto.setWriter("����ȭ");
		dto.setPasswd(1234);
		
		System.out.println(dto.getBbsno());
		System.out.println(dto.getWriter());
		System.out.println(dto.getPasswd());
		
//------------------------------------------------------------
		//getter�� setter�Լ��� �ڵ��߰� ����
		//�޴� -> Source -> Generate Getters and Setters...
		//->MemberDTOŬ������ �׽�Ʈ
		
		
		
		
	}//main() end
}//class end
