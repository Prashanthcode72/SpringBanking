package urlrewrriyting;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/rw2")
public class rewritting2 extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getParameter("a")==null)
		{
			resp.getWriter().print("<h1>Invalid html</h1>");
		}
		else {
		
		String b=req.getParameter("a");
		
		
		
		resp.getWriter().print("<h1>"+b+"</h1>");
		}
	}

}
