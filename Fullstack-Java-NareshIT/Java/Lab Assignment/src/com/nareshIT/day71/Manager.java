package com.nareshIT.day71;

public class Manager extends Employee {
    private ManagerType type;

    public ManagerType getType() {
        return type;
    }

    public void setType(ManagerType type) {
        this.type = type;
    }

    public Manager(String name, int employeeId, double salary, ManagerType type) {
        super(name, employeeId, salary);
        this.type = type;
        setSalary(salary);
    }

    public Manager() {}

    @Override
    public void setSalary(double salary) {
        if (type == ManagerType.HR) {
            super.setSalary(salary + 10000);
        } else {
            super.setSalary(salary + 5000);
        }
    }
}