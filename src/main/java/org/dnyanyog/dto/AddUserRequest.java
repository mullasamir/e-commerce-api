package org.dnyanyog.dto;

import java.sql.SQLException;

import org.dnyanyog.common.DbUtils;

public class AddUserRequest {
	public String fname;
	public String lname;
	public int age;
	public String gender;
	public String email;
	public String password;
	
	public AddUserRequest(String fname,String lname, int age ,String email, String gender, 
			String password) {
		this.fname=fname;
		this.lname=lname;
		this.age=age;
		this.password=password;
		this.email=email;
		this.gender=gender;
	}
	
	public boolean addUserIntoDb() throws SQLException {
		
		String query = "insert into e_user(fname , lname, age, gender, email, pass)values('" + fname
				+ "', '" + lname + "', '" + age + "', '" + gender + "', '" + email + "', '"
				+ password + "')";
		
		int rowsInserted= DbUtils.executeQuery(query);
		return rowsInserted>0;
	
	}

}
