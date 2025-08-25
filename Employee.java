package Employee;

public class Employee {

	String name;
	int id;
	double salary;
	public Employee(String n,int d,double sal)
	{
		name=n;
		id=d;
		salary=sal;
	}
	
	void display()
	{
		System.out.println("employee details are");
		System.out.println("name is " +name);
		System.out.println("id is" +id);
		System.out.println("salary is"+salary);
		
	}
	void inc_salary(double percentage)
	{
		double incremnt=(salary*percentage)/100;
		salary=salary+incremnt;
		System.out.println("employee salary increses by"+salary);
	}
	}
	