package com.proman.web.model;

public class User {

    private String username;

	private String password;

    private String retypedpassword;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getRetypedpassword() {
		return retypedpassword;
	}

	public void setRetypedpassword(String retypedpassword) {
		this.retypedpassword = retypedpassword;
	}

}
