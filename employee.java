package com.ss.info;

public class employee {
int emp_id;
int count;
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
public employee(int emp_id, String emp_name, int dept_id, String emp_address, String dept_name, String username,
		String password) {
	super();
	this.emp_id = emp_id;
	this.emp_name = emp_name;
	this.dept_id = dept_id;
	this.emp_address = emp_address;
	this.dept_name = dept_name;
	this.username = username;
	this.password = password;
}
public employee()
{
	
}
public employee(String emp_name, int dept_id) {
	super();
	this.emp_name = emp_name;
	this.dept_id = dept_id;
}
String emp_name;
int dept_id;
String emp_address;
String dept_name;
String username;
String password;
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public int getDept_id() {
	return dept_id;
}
public void setDept_id(int dept_id) {
	this.dept_id = dept_id;
}
public String getEmp_address() {
	return emp_address;
}
public void setEmp_address(String emp_address) {
	this.emp_address = emp_address;
}
public String getDept_name() {
	return dept_name;
}
public void setDept_name(String dept_name) {
	this.dept_name = dept_name;
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
