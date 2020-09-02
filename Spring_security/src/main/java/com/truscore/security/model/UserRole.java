package com.truscore.security.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="UserRole")
public class UserRole {
private int id;
private String roleName;
@ManyToMany(fetch=FetchType.LAZY)
@JoinTable(name="role_priviliges",joinColumns={@JoinColumn(name="RoleId",nullable=false)},inverseJoinColumns={@JoinColumn(name="PriviligesId",nullable=false)})
private List<Privileges> privilegesList=new ArrayList<Privileges>();
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getRoleName() {
	return roleName;
}
public void setRoleName(String roleName) {
	this.roleName = roleName;
}
public List<Privileges> getPrivilegesList() {
	return privilegesList;
}
public void setPrivilegesList(List<Privileges> privilegesList) {
	this.privilegesList = privilegesList;
}
}
