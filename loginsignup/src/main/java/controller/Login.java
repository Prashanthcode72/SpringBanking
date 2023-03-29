package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dto.UserInfo;

@WebServlet("/login")
public class Login extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String emph=req.getParameter("emph");
		String password=req.getParameter("psw");
		
		UserDao dao=new UserDao();
		
		try{
			long mobile=Long.parseLong(emph);
			UserInfo userInfo=dao.fetch(mobile);
			List<UserInfo> list=dao.fetchAll();
			if(userInfo==null){
				res.getWriter().print("<h1>Invalid Mobile Number</h1>");
			}
			else{
				if(userInfo.getPassword().equals(password)){
					res.getWriter().print("<h1>Login Success</h1>");
//					res.sendRedirect("https://www.youtube.com/");
					res.getWriter().print("<table border='2px'>");
					res.getWriter().print("<tr>");
					res.getWriter().print("<th>Id</th>");
					res.getWriter().print("<th>Name</th>");
					res.getWriter().print("<th>Mobile</th>");
					res.getWriter().print("<th>Email</th>");
					res.getWriter().print("<th>Password</th>");
					res.getWriter().print("<th>Date</th>");
					res.getWriter().print("<th>Gender</th>");
					res.getWriter().print("<th>Address</th>");
					res.getWriter().print("<th>Country</th>");
					res.getWriter().print("<th>Skills</th>");
					
					for (UserInfo userInfo2 : list) {
						res.getWriter().print("<tr>");
						res.getWriter().print("<th>"+ userInfo2.getId()+"</th>"); 
						res.getWriter().print("<th>"+ userInfo2.getName()+"</th>");
						res.getWriter().print("<th>"+ userInfo2.getId()+"</th>");
						res.getWriter().print("<th>"+ userInfo2.getEmail()+"</th>");
						res.getWriter().print("<th>"+ userInfo2.getPassword()+"</th>");
						res.getWriter().print("<th>"+ userInfo2.getDate()+"</th>");
						res.getWriter().print("<th>"+ userInfo2.getGender()+"</th>");
						res.getWriter().print("<th>"+ userInfo2.getAddress()+"</th>");
						res.getWriter().print("<th>"+ userInfo2.getCountry()+"</th>");
						res.getWriter().print("<th>"+  userInfo2.getSkills()+"</th>");
//						res.getWriter().print("</table>");
						
					}
				}
				else{
					res.getWriter().print("<h1>Invalid Password</h1>");
				}
			}
		}
		catch(NumberFormatException e){
			String email=emph;
			UserInfo userInfo=dao.fetch(email);
			if(userInfo==null){
				res.getWriter().print("<h1>Invalid Email</h1>");
			}
			else{
				if(userInfo.getPassword().equals(password)){
					res.getWriter().print("<h1>Login Success</h1>");
					res.sendRedirect("https://www.youtube.com/");
				}
				else{
					res.getWriter().print("<h1>Invalid Password</h1>");
				}
			}
		}
	}
}