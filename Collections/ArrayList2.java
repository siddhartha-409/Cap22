package com.demo.collection;

import java.util.ArrayList;
import java.util.Iterator;

class Employee
{
	int empid;
	String empname;
	String empemail;
	char empgender;
	float empsalary;
	Employee(int empid,String empname,String empemail,char empgender,float empsalary)
	{
		this.empid = empid;
		this.empname = empname;
		this.empemail = empemail;
		this.empgender = empgender;
		this.empsalary = empsalary;
	}
	
	void GetEmployeeDetails()
	{
		System.out.println(empid+" "+empname+" "+empemail+" "+empgender+" "+empsalary);
	}
	
	
}

class EmployeeDB
{
	
	ArrayList<Employee> empdb = new ArrayList<>();
	boolean addEmployee(Employee e)
	{
		return empdb.add(e);
	}
	
	boolean deleteEmployee(int empId)
	{
		boolean del = false;		
				
		for(Employee e:empdb)
		{
			if(e.empid==empId)
				empdb.remove(e);
				del=true;
		}
		
		return del;
		
	}
	
	String showPaySlip(int empId)
	{
		String paySlip = "Invalid employee Id";
	
		for (Employee e : empdb) {
			if (e.empid == empId) {
				paySlip = "Pay slip for employee id " + empId + " is " +
						e.empsalary;
			}
		}
		return paySlip;
				
	}
	
	Employee[] listAll()
	{
		Employee[] employee = new Employee[empdb.size()];
		Iterator<Employee> iter = empdb.iterator();
		int i = 0;
		while(iter.hasNext())
		{
			employee[0]=(iter.next());
			i+=1;
		}
		return employee;
		/*
		Employee[] empArray = new Employee[empdb.size()];
		for(Employee i:empdb)
		{
			empArray.append(i.GetEmployeeDetails());
		}
		Employee[] empArray = new Employee[empdb.size()];
		for (int i = 0; i < empdb.size(); i++)
			empArray[i] = empdb.get(i);
		return empArray;
		*/
	}
}
public class ArrayList2 {

	public static void main(String[] args) {
		
		Employee e1 =new Employee(100,"Ram","ram@yahoo.com",'M',15000);
		Employee e2=new Employee(101,"Shyam","Shyam@yahoo.com",'M',20000);
		EmployeeDB db = new EmployeeDB();
		
		db.addEmployee(e1);
		db.addEmployee(e2);
		
		db.showPaySlip(101);
		db.showPaySlip(102);
		
		System.out.println(db.listAll());
		
		db.deleteEmployee(102);
		db.deleteEmployee(100);
		
		System.out.println(db.listAll());	
		
		System.out.println(db);
		

	}

}
