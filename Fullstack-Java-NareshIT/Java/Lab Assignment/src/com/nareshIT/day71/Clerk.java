package com.nareshIT.day71;

public class Clerk extends Employee {
    private int speed;
    private int accuracy;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        reSetSal();
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
        reSetSal();
    }

    public Clerk(String name, int employeeId, double salary, int speed, int accuracy) {
        super(name, employeeId, salary);
        this.speed = speed;
        this.accuracy = accuracy;
        reSetSal();
    }

    public Clerk() {}

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
        reSetSal();  
    }

    private void reSetSal() {
        if (speed > 70 && accuracy > 80) {
            super.setSalary(getSalary() + 1000);
        }
    }
}
