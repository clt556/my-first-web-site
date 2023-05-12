package kr.co.test.member;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTest {
	@Test
	public void test() throws JsonProcessingException {
		MemberVO vo = new MemberVO();
		vo.setId("fsdfsdf");
		vo.setName(null);
		vo.setEmail("sfsdf@fewfsf");
		
		ObjectMapper om = new ObjectMapper();
		String json = om.writeValueAsString(vo);
		System.out.println(json);
		
		MemberVO vo2 = om.readValue(json,MemberVO.class);
		System.out.println(vo2);
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		vo2.setName("ㄴㅇ룽니렁니ㅏ런ㅇ");
		list.add(vo);
		list.add(vo2);
		
		String json2 = om.writeValueAsString(list);
		System.out.println(json2);
		
		List<MemberVO> list2 = om.readValue(json2, new TypeReference<ArrayList<MemberVO>>() {});
		System.out.println(list2);
	}
	
	
	
	
}
