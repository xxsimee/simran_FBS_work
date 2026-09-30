package p2;

import p1.Employee;

public class Hr extends Employee {
	
	int commission;

	Hr() {
		super();
		this.commission = 0;
	}
	public Hr(int id,String name,int salary,int commission) {
		super(id,name,salary);
		this.commission = commission;
	}
	int getCommission() {
		return commission;
	}
	void setCommission(int commission) {
		this.commission = commission;
	}
	protected double calsal()
	{
		return this.salary+this.commission;
	}
	public String toString() {
		return super.toString()+"\nCommission: "+this.commission;
	}
}
