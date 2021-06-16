package model;

import java.io.Serializable;

public class UserBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String getUserid = null;
	
	private String fullname;
	private String grade;
	private String address;
	private String email;
	private String userrole;
	private String username;
	private String password;

	
	
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserBean(String fullname, String grade, String address, String email, String userrole, String username,
			String password) {
		super();
		this.fullname = fullname;
		this.grade = grade;
		this.address = address;
		this.email = email;
		this.userrole = userrole;
		this.username = username;
		this.password = password;
	}

	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
