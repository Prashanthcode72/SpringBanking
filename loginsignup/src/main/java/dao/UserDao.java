package dao;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.UserDao;
import dto.UserInfo;

@WebServlet("/signup")
public class Signup extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String s=req.getParameter("name");
		long a=Long.parseLong(req.getParameter("mob"));
		String b=req.getParameter("email");
		String c=req.getParameter("psw");
		Date d=Date.valueOf(req.getParameter("dob"));
		String e=req.getParameter("gender");
		String f=req.getParameter("address");
		String g=req.getParameter("Country");
		String[] h=req.getParameterValues("Skills");
		
		Date date=Date.valueOf(req.getParameter("dob"));
		
		UserInfo ui=new UserInfo();
		ui.setS(s);
		ui.setA(a);
		ui.setB(b);
		ui.setC(c);
		ui.setD(d);
		ui.setE(e);
		ui.setF(f);
		ui.setG(g);
		ui.setH(h);
		
		ui.setAge(Period.between(date.toLocalDate(),LocalDate.now()).getYears());
		
		UserDao dao=new UserDao();
		dao.save(ui);
		
		res.getWriter().print("<h1>Account Created Successfuylly...</h1>");
		
//		res.getWriter().print("<h1>"
//				+ "<br>Name: "+s
//				+ "<br>Mobile: "+a
//				+ "<br>Email: "+b
//				+ "<br>Password: "+c
//				+ "<br>Date of Birth: "+d
//				+ "<br>Gender: "+e
//				+ "<br>Address: "+f
//				+ "<br>Country: "+g
//				+ "<br>Skills: "+Arrays.toString(h)
//				+ "</h1>");
	
		
	}

}
