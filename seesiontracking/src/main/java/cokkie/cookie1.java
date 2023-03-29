package cokkie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie1")
public class cookie1 extends HttpServlet
{
@Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	String un="Asta";
	String pwd="1234";


	Cookie c=new Cookie("un",un);
	c.setMaxAge(6);
	Cookie c1=new Cookie("pwd",pwd);
	c1.setMaxAge();
	res.addCookie(c);
	res.addCookie(c1);
	res.sendRedirect("cookie2");
	
}
}