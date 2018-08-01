package com.proman.server.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role implements Serializable {

    private static final long serialVersionUID = 8215940655966357715L;

    @Id
    @Column(name = "role_id", unique = true, nullable = false)
    private int role_id;

    @Column(name = "role_name", unique = true, nullable = false, length = 10)
    private String name;
    
    @Column(name = "role_description", nullable = false, length = 50)
    private String roleDescription;
    
    @Column(name = "role_long_description", nullable = false, length = 256)
    private String roleLongDescription;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Role() {
    }

    public Role(int id, String name) {
        this.role_id = id;
        this.name = name;
    }

    public Role(int id, String name, User user) {
        this.role_id = id;
        this.name = name;
        this.user = user;
    }

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public String getRoleLongDescription() {
		return roleLongDescription;
	}

	public void setRoleLongDescription(String roleLongDescription) {
		this.roleLongDescription = roleLongDescription;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
