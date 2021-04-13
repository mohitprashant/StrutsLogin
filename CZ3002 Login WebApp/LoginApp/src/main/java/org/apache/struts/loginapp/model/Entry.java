package org.apache.struts.loginapp.model;
//
public class Entry {
	private String user;
	private String pass;
	
	public Entry(String user, String pass) {
		this.user=user;
		this.pass=pass;
	}
	
	public String getUser() {
		return this.user;
	}
	
	public String getPass() {
		return this.pass;
	}
	
}
