package com.ss.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.Statement;

public class login extends HttpServlet {
	
String LOGIN="select * from employee";
	 public Connection getconnection()
	   {
		   Connection con=null;
       try
       {
      	 Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","password");
       }
       
      
   catch(Exception e)
       {
  	 System.out.print(e);

 }
       return con;
	   }
      		
    
	   public void doGet(HttpServletRequest request, HttpServletResponse response) {
		   String uname=request.getParameter("username");
		   String pass=request.getParameter("password");
		   String dbusername="";
		   String dbpassword="";
		   int flag=0;
		   
		   try (Connection con = getconnection();
					PreparedStatement preparedStatement = con.prepareStatement(LOGIN)) {
			    ResultSet rs = preparedStatement.executeQuery(LOGIN);
			    PrintWriter out=response.getWriter();
			    while(rs.next()){
			    	dbusername=rs.getString("username");
			    	dbpassword=rs.getString("password");
			    if ((uname.equals(dbusername)) && (pass.equals(dbpassword))) {
        			out.print("Hey you have successfully logged in wait for to update service");
        			flag=1;
        			break;
        			
        }
			    
			 
			    }
			   
			    if(flag==0)
			    	out.print("Please enter correct username and password to continue...");
		   }
		   catch(Exception e) {
			   System.out.print(e);
			
			    
			  
	   }

}
}
