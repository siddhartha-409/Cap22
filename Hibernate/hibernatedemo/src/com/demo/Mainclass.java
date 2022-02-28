package com.demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class CrudOperation
{
	private static SessionFactory sessionFactory = null;
	Transaction transaction = null;
	Integer employeeid = null;
	Session sessiong = null;
	
	//business logic part for insert
	public Integer addEmployee(String firstname,String lastname,String salary)
	{
		//initialize the session
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		
		//begin transaction		
		
		transaction = session.beginTransaction();
		Employee employee = new Employee(firstname,lastname,salary);
		employeeid = (Integer) session.save(employee);  // this save() will form "insert into table" query automatically in db.
		
		transaction.commit();		
		return employeeid;
	}
	
	// read the list of employees from table
	public void readEmployee()
	{
		//initialize the session
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		
		//begin transaction		
		
		transaction = session.beginTransaction();		
		
		Query query = session.createQuery("FROM Employee"); // HQL fashion for sql queries
				
		List<Employee> employeelist = query.list();
		
		for(Employee newlist:employeelist)
		{
			System.out.println("first name is "+newlist.getFirstname());
			System.out.println("last name is "+newlist.getLastname());
			System.out.println("salary is "+newlist.getSalary());
			
		}		
	}
	
	
	// for update
	public Employee updateEmployeeById(Employee emp,int id)
	{		
		//initialize the session
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
				
		//begin transaction						
		transaction = session.beginTransaction();			
		Employee employe = (Employee) session.get(Employee.class,id); //updated by id
		employe.setFirstname(emp.getFirstname());
		employe.setLastname(emp.getLastname());
		employe.setSalary(emp.getSalary());		
		transaction.commit();
		
		return employe;
	}
	
	
	/// this method is used for only retrieve the id from db
		public Employee findById(int empid) {
		
			sessionFactory = new Configuration().configure().buildSessionFactory();
			sessiong = sessionFactory.openSession();
			// begin transaction
			transaction=sessiong.beginTransaction();
			Employee findbyid = (Employee)sessiong.load(Employee.class, empid);
			return findbyid;  //return the id  from the db
		}
		
		//we need common session

	   void deleteEmployeeRecordById(int empid) {
		
			sessionFactory = new Configuration().configure().buildSessionFactory();
			sessiong = sessionFactory.openSession();
			transaction=sessiong.beginTransaction();
			Employee deleteobj = findById(empid); //fetching existing id from the database with the help of findByIdMethod()
			sessiong.delete(deleteobj);
			transaction.commit();
		   
	   }
	
	
}

public class Mainclass {	

	public static void main(String[] args) {
		
		CrudOperation crudOperation = new CrudOperation();
		// for inserting values in db
		//Integer result = crudOperation.addEmployee("ram","kumar","45000");
		//System.out.println("result is "+result);
		
		// for reading values from
		crudOperation.readEmployee();	
		
		//updating
		Employee updatedetails = new Employee();				
		updatedetails.setFirstname("Tom");
		updatedetails.setLastname("Hanks");
		updatedetails.setSalary("8000");
		
		Employee employee = crudOperation.updateEmployeeById(updatedetails,3);
		
		String firstname = employee.getFirstname();
		
		System.out.println("updated value is "+firstname);
		
		Employee gotid = crudOperation.findById(4);
				
		System.out.println("is.."+gotid.getId());
		
		crudOperation.deleteEmployeeRecordById(4);
		
		System.out.println("Done....");		
		
	}

}
