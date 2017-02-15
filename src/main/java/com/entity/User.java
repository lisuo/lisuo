package com.entity;

import java.io.Serializable;
//不能导入hibernate的
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity  
@Table(name="tb_user")
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class User implements Serializable
{
	
	private static final long serialVersionUID = 907461129748522453L;
	
	@Id
	//设置String类型的ID自增长，曾出错
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false, length = 36)
	private int String;
	
	@Column(name = "name", length = 36)
	private String name;
	
	@Column(name = "email", length = 36)
	private String email;
	
	@Column(name = "password", length = 36)
	private String password;
	
	
	public int getString() {
		return String;
	}
	public void setString(int string) {
		String = string;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
