package kr.co.test.member;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class MemberVO {
	private int memberno;
	private String id;
	private String pwd;
	private String name;
	private String email;
	private Timestamp joindate;
	private String filename_org="";
	private String filename_real="";
	
	//위에가 담는 멤버변수들, 아래가 검색할때 쓸 용도의 멤버변수들
	private String searchWord;
	private int sGender = -1;
	private String orderColumn = "joindate"; //정렬할 컬럼명
	private String order = "ASC"; //정렬 기준: DESC, ASC 둘 중 하나일 것
	private String state; //여기에 여러개를 동시에 할당하면, String이 자동으로 String[]으로 변함
	private Timestamp regdate;
	private int[] hobby;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Timestamp getJoindate() {
		return joindate;
	}
	public void setJoindate(Timestamp joindate) {
		this.joindate = joindate;
	}
	public String getSearchWord() {
		return searchWord;
	}
	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}
	public int getsGender() {
		return sGender;
	}
	public void setsGender(int sGender) {
		this.sGender = sGender;
	}
	
	public String getOrderColumn() {
		return orderColumn;
	}
	public void setOrderColumn(String orderColumn) {
		this.orderColumn = orderColumn;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	public int getMemberno() {
		return memberno;
	}
	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}
	public int[] getHobby() {
		return hobby;
	}
	public void setHobby(int[] hobby) {
		this.hobby = hobby;
	}
	public String getFilename_org() {
		return filename_org;
	}
	public void setFilename_org(String filename_org) {
		this.filename_org = filename_org;
	}
	public String getFilename_real() {
		return filename_real;
	}
	public void setFilename_real(String filename_real) {
		this.filename_real = filename_real;
	}
}
