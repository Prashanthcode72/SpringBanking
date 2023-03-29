package cokkie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie2")
public class cookie2 extends HttpServlet
{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   Cookie[] cookies=req.getCookies();	

   for(Cookie cookie:cookies)
   {
	   if(cookie.getName().equals("un"))
   resp.getWriter().print("<h1>"+cookie.getValue()+"</h1>");
	   if(cookie.getName().equals("pwd"))
		   resp.getWriter().print("<h1>"+cookie.getValue()+"</h1>");
   
   }
}
}
