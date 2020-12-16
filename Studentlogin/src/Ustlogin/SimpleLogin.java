package Ustlogin;
import java.io.*;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SimpleLogin extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		
		PrintWriter pw= res.getWriter();
		res.setContentType("text/html");
		
		String user= req.getParameter("userName");
		String dob= req.getParameter("userDOB");
		String mat= req.getParameter("mat");
		String soc= req.getParameter("soc");
		String sci= req.getParameter("sci");
		
		if(user.equals("deepak")&& dob.equals("10-5-1997"))
			pw.println("marks of deepak" + "Maths :"+ mat +"social :" + soc + "science :" +sci);
		else if(user.equals("vignesh")&& dob.equals("05-10-1997"))
			pw.println("marks of deepak" + "Maths :"+ mat +"social :" + soc + "science :" +sci);
		else
			pw.println("failed");
		pw.close();
		
		
		
		
	}

}
