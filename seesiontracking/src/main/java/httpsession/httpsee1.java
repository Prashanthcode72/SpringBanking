package httpsession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/https2")
public class httpsee1 extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	HttpSession http=req.getSession();
	String a=(String) http.getAttribute("a");
	int b=(Integer) http.getAttribute("b");
	
	
	resp.getWriter().print("<h1>"+a+"</h1>");
	resp.getWriter().print("<h1>"+b+"</h1>");
	}
}
