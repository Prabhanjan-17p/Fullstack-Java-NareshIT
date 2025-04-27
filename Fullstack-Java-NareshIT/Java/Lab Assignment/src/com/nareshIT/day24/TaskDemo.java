package com.nareshIT.day24;

public class TaskDemo {
	public static void main(String[] args) {
		TaxUtil t = new TaxUtil();
	    Employee emp = new Employee(1, "Alice", 25000, 5000, 2000);
	    double totPayEMP = t.calculateTax(emp);
	    Manager mgr = new Manager(2, "Bob", 40000, 8000, 3000, 5000);
	    double totPayMGR =t.calculateTax(mgr);
	    Trainer trn = new Trainer(3, "Charlie", 30000, 7000, 3000, 5, 2000);
	    double totPayTRN =t.calculateTax(trn);
	    Sourcing src = new Sourcing(4, "David", 35000, 6000, 2500, 50, 40, 500);
	    double totPaySRC =t.calculateTax(src);
	    
	    System.out.println(totPayEMP+":"+totPayMGR+":"+totPayTRN+":"+totPaySRC);
	}
}
