package com.cakedelights.bo;

public class RegisterBO {
	private String email;
	private String username;
	private String password;
	private String confPassword;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getConfPassword() {
		return confPassword;
	}
	public void setConfPassword(String confPassword) {
		this.confPassword = confPassword;
	}
	@Override
	public String toString() {
		return "RegisterBO [email=" + email + ", username=" + username + ", password=" + password + ", confPassword="
				+ confPassword + "]";
	}
	

}
