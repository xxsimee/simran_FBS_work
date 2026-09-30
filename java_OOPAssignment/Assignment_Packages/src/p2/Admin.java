package p2;

import p1.Employee;

public class Admin extends Employee {
	int allownace;

	Admin() {
		super();
		this.allownace = 0;
	}
	public Admin(int id,String name,int salary,int allownace) {
		super(id,name,salary);
		this.allownace = allownace;
	}
	int getAllownace() {
		return allownace;
	}
	void setAllownace(int allownace) {
		this.allownace = allownace;
	}
	
	protected double calsal()
	{
		return this.salary+this.allownace;
	}
	public String toString() {
		return super.toString()+"\n Allownace: "+this.allownace;
	}
}
