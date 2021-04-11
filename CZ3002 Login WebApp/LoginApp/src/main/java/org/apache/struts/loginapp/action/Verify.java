package org.apache.struts.loginapp.action;

import org.apache.struts.loginapp.model.*;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;

public class Verify extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	
	public String user;
	public String pass;
	
	//Checks if the entry exists in the database.
	public static boolean verify(Entry e) {
		ResultSet results = null;
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
			
			String pass = e.getPass();
			String user = e.getUser();
			
			String q = "SELECT COUNT(*) AS total FROM LoginApp.credentials WHERE user='"+user+
					"' AND password='"+pass+"';";
			
			Statement stmt = con.createStatement();
			
			results = stmt.executeQuery(q);
			
			results.next();
			   
		   if(results.getInt("total")==0) {
			   return false;
		   }
		   else {
			   return true;
		   }
			
		}
		catch (Exception x){
			System.out.print(x.getStackTrace());
		}
		
		return false;
	}
	
	
	public void setUser(String user) {
		this.user = user;
	}
	
	
	public void setPass(String pass){
		this.pass = pass;
	}
	
	public String getUser() {
		return user;
	}
	
	
	public String getPass(){
		return pass;
	}
	
	
	public String execute() throws Exception {
		if(verify(new Entry(user, pass))==true) {
			return "SUCCESS";
		}
		return "FAILURE";
	}
}
