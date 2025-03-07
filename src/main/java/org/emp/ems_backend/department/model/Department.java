package org.emp.ems_backend.department.model;

public class Department {
    private Long deprtId;
    private String deprtName;
    private String deprtDescription;

    // Constructors
    public Department() {}

    public Department(Long deprtId, String deprtName, String deprtDescription) {
        this.deprtId = deprtId;
        this.deprtName = deprtName;
        this.deprtDescription = deprtDescription;
    }

    // Getters and Setters
    public Long getDeprtId() {
        return deprtId;
    }

    public void setDeprtId(Long deprtId) {
        this.deprtId = deprtId;
    }

    public String getDeprtName() {
        return deprtName;
    }

    public void setDeprtName(String deprtName) {
        this.deprtName = deprtName;
    }

    public String getDeprtDescription() {
        return deprtDescription;
    }

    public void setDeprtDescription(String deprtDescription) {
        this.deprtDescription = deprtDescription;
    }
}
