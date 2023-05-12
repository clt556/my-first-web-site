package kr.co.test.api;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.test.member.MemberMapper;
import kr.co.test.member.MemberVO;

@RestController //모든 메소드가 api 용도로 사용될것
@RequestMapping("/api")
@CrossOrigin(origins = {"http://127.0.0.1:5501"})
public class ApiController {
	
	@GetMapping("/test")
	//@ResponseBody // 메소드를 api 용도로 만들기
	public String test() {
		return "test";
	}
	
	@GetMapping("/member")
	public MemberVO member() {
		MemberVO vo = new MemberVO();
		vo.setId("hong");
		vo.setName("sdmfls");
		return vo;
	}
	
	@Autowired
	MemberMapper mapper;
	
	@GetMapping("/member/*")
	public List<MemberVO> all(MemberVO vo){
		return mapper.allList(vo);
	}
	
	@GetMapping("/member/{memberno}")
	public MemberVO selectOne(@PathVariable int memberno) {
		return mapper.selectOne(memberno);
	}
	
	@PostMapping("/member/insert")
	public void post(@RequestBody Map<String,Object> param) {
		Iterator key = param.keySet().iterator();
		while(key.hasNext()) {
			String k = (String)key.next();
			System.out.println(k+ ":"+param.get(k));
		}
	}
	
	@PutMapping("/member/insert2")
	public String post2(@RequestBody MemberVO vo) {
		return mapper.insert(vo) > 0 ? "success" : "fail";
	}
	
	@PutMapping("/member/insert3")
	public ResponseEntity<MemberVO> put3(@RequestBody MemberVO vo) {
		System.out.println(vo);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(vo);
	}
	
	@PostMapping("/member/insert3")
	public String insert3(MemberVO vo) {
		return mapper.insert(vo) > 0 ? "success":"fail";
	}
	
	@GetMapping("/member/list")
	public ResponseObject memberList(MemberVO vo) {
		ResponseObject ro = new ResponseObject();
		ro.setTotalcount(mapper.count(vo));
		ro.setItems(mapper.allList(vo));
		return ro;
	}
	
	
}
