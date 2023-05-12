package kr.co.test.member;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {
	
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response) throws Exception{
		HttpSession sess = request.getSession();
		if(sess.getAttribute("loginSession") == null) {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print("<script>");
			out.print("alert('로그인 먼저 하삼');");
			out.print("location.href='index.do';");
			out.print("</script>");
			return false;
		}else {
			return true;
		}
		
	}
}
