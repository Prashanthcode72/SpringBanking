package httpsession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/https1")
public class httpsee extends HttpServlet
{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String a="servlet";
	int b=1;
	HttpSession http=req.getSession();
	http.setAttribute("a", a);
	http.setAttribute("b", b);
	

	req.getRequestDispatcher("https2").forward(req,resp);
	
	
}
}
