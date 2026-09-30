package p3;

import p1.Employee;
import p2.Admin;
import p2.Hr;
import p2.SaleManager;

public class Test {

	public static void main(String[] args) {
Employee e1;
		
		System.out.println("Admin Detail are: ");
		 e1=new Admin(101,"jiya",10000,2000);
		System.out.println(e1);
		System.out.println();
		
		System.out.println("Sale Manager details are: ");
		e1=new SaleManager(101,"simran",2999,9000,3455);
		System.out.println(e1);
		System.out.println();
		
		System.out.println("HR detail are: ");
		e1=new Hr(103,"simee",30000,2999);
		System.out.println(e1);
	}

}
