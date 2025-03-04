package org.emp.ems_backend.employee.model;
public class Employee {

	private String name;
	private String email;
	private String address;
	private String gender;
	
	private Long empId;
	private Long deptId;
	private Long phoneNo;
	private Long dob;
	
	//constructors
	public Employee() {}

	public Employee(Long empId, String name, String email, String gender, String address, Long deptId, Long phoneNo, Long dob) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.gender = gender;
		this.empId = empId;
		this.deptId = deptId;
		this.phoneNo = phoneNo;
		this.dob = dob;
	}

	//getter setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Long getDob() {
		return dob;
	}
	public void setDob(Long dob) {
		this.dob = dob;
	}
	
	
}
