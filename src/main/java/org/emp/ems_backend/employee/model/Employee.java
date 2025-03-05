package org.emp.ems_backend.employee.model;

import java.time.LocalDate; // Or java.sql.Date, depending on your choice

public class Employee {
    private Long empId;
    private String empName;
    private String empEmail;
    private String gender;
    private String address;
    private Long empDepartmentId;
    private String phoneNo; // Use String instead of Long for phone numbers
    private LocalDate dob;  // Change to LocalDate if needed

    // Constructor
    public Employee(Long empId, String empName, String empEmail, String gender, String address,
                    Long empDepartmentId, String phoneNo, LocalDate dob) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.gender = gender;
        this.address = address;
        this.empDepartmentId = empDepartmentId;
        this.phoneNo = phoneNo;
        this.dob = dob;
    }

    // Getters
    public Long getEmpId() { return empId; }
    public String getEmpName() { return empName; }
    public String getEmpEmail() { return empEmail; }
    public String getGender() { return gender; }
    public String getAddress() { return address; }
    public Long getEmpDepartmentId() { return empDepartmentId; }
    public String getPhoneNo() { return phoneNo; }
    public LocalDate getDob() { return dob; }

    // Setters (if needed)
    public void setEmpId(Long empId) { this.empId = empId; }
    public void setEmpName(String empName) { this.empName = empName; }
    public void setEmpEmail(String empEmail) { this.empEmail = empEmail; }
    public void setGender(String gender) { this.gender = gender; }
    public void setAddress(String address) { this.address = address; }
    public void setEmpDepartmentId(Long empDepartmentId) { this.empDepartmentId = empDepartmentId; }
    public void setPhoneNo(String phoneNo) { this.phoneNo = phoneNo; }
    public void setDob(LocalDate dob) { this.dob = dob; }
}
