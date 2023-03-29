package setattribute;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/attribute1")
public class SetAttribute1 extends HttpServlet
{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String a="Heyyyyy";
   req.setAttribute("a", a);
   
   req.getRequestDispatcher("attribute2").forward(req, resp);
}
}
