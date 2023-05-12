package kr.co.test.api;

import java.util.Date;
import java.util.List;

import kr.co.test.member.MemberVO;

public class ResponseObject {
	private int totalcount;
	private Date regdate;
	private List<MemberVO> items;
	
	public ResponseObject() {
		this.setRegdate(new Date());
	}

	public int getTotalcount() {
		return totalcount;
	}

	public void setTotalcount(int totalcount) {
		this.totalcount = totalcount;
	}

	public List<MemberVO> getItems() {
		return items;
	}

	public void setItems(List<MemberVO> items) {
		this.items = items;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
}
