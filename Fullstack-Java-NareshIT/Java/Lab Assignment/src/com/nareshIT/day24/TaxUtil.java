package com.nareshIT.day24;

public class TaxUtil {
	
	public static double calculateTax(Employee e) {
        double grossSalary = e.calculateGrossSalary();
        return (grossSalary > 30000) ? grossSalary * 0.20 : grossSalary * 0.05;
    }
	public static double calculateTax(Manager e) {
        double grossSalary = e.calculateGrossSalary();
        return (grossSalary > 30000) ? grossSalary * 0.20 : grossSalary * 0.05;
    }
	public static double calculateTax(Trainer t) {
        double grossSalary = t.calculateGrossSalary();
        return (grossSalary > 30000) ? grossSalary * 0.20 : grossSalary * 0.05;
    }
	public static double calculateTax(Sourcing s) {
        double grossSalary = s.calculateGrossSalary();
        return (grossSalary > 30000) ? grossSalary * 0.20 : grossSalary * 0.05;
    }
	
}
