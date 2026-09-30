package p2;

import p1.Employee;

public class SaleManager extends Employee {
	int incentive;
	int target;
	
	SaleManager() {
		super();
		this.incentive = 0;
		this.target = 0;
	}
	public SaleManager(int id,String name,int salary,int incentive, int target) {
		super(id,name,salary);
		this.incentive = incentive;
		this.target = target;
	}
	int getIncentive() {
		return incentive;
	}
	void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	int getTarget() {
		return target;
	}
	void setTarget(int target) {
		this.target = target;
	}
	protected double calsal()
	{
		return this.salary+this.incentive;
	}
	public String toString() {
		return super.toString()+"\nTarget: "+this.target+"\nIncentive: "+this.incentive;
	}
}
