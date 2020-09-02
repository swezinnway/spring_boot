package com.truscore.security.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="Privileges")
public class Privileges {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="roleCode")
	private String roleCode;
	@Column(name="privilegeName")
	private String privilegeName;
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="privilegesList")
	private List<UserRole> roleList=new ArrayList<UserRole>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getPrivilegeName() {
		return privilegeName;
	}
	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}
	public List<UserRole> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<UserRole> roleList) {
		this.roleList = roleList;
	}
}
