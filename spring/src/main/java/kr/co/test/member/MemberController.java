package kr.co.test.member;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class MemberController {
	@Autowired
	private MemberService service;
	
	@GetMapping("/member/index.do")
	public String index(Model model,
						@RequestParam(value="searchWord", required=false) String searchWord,
						MemberVO vo
			) {
		model.addAttribute("list",service.addList(vo));
		return "member/index";
	}
	
	@GetMapping("/member/write.do")
	public String write(Model model) {
		return "member/write";
	}
	
	@PostMapping("/member/write.do")
	public void insert(HttpServletRequest req,HttpServletResponse res, MemberVO param, @RequestParam MultipartFile filename)throws IOException {
		if(!filename.isEmpty()) {
			param.setFilename_org(filename.getOriginalFilename());
			param.setFilename_real(System.currentTimeMillis()+filename.getOriginalFilename().substring(filename.getOriginalFilename().lastIndexOf(".")));
			String path = req.getRealPath("/upload/");
			filename.transferTo(new File(path+System.currentTimeMillis()+filename.getOriginalFilename().substring(filename.getOriginalFilename().lastIndexOf("."))));
			
		}
		int r = service.insert(param);
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.print("<script>");
		if(r>0) {
			out.print("alert('가입ㅊㅋ');");
			out.print("location.href='index.do';");
			
		}else {
			out.print("alert('실패 ㅊㅋ');");
			out.print("history.back()");
		}
		out.print("</script>");
	}
	
	@GetMapping("/member/login.do")
	public String login(HttpSession sess) {
		sess.setAttribute("loginSession", "홍길동");
		return "redirect:index.do";
	}
	
	@GetMapping("/member/asdf")
	public String onTheMove() {
		return "member/webapp";
	}
	
	
}
