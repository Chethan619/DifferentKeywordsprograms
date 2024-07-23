package july08programs;

public class ThisKeyword_July09 
{
	/* int age; //this program we know like fetching the default values when variables are global
	String name;
	double salary;
	void student_details(int age, String name, double salary)
	{
		System.out.println("Non-static method");
	}
	public static void main(String[] args) 
	{
		ThisKeyword_July09 t1=new ThisKeyword_July09();
		System.out.println(t1.age); // it gives me the default value of int
		System.out.println(t1.name); // it gives me the default value of string
		System.out.println(t1.salary); // it gives me the default value of double
	} */
	
	int age; //now making use of this keyword
	String name;
	double salary;
	void student_details(int age, String name, double salary)
	{
		this.age=age; //assigning local to global
		this.name=name; //assigning local to global
		this.salary=salary; //assigning local to global
	}
	public static void main(String[] args) 
	{
		ThisKeyword_July09 t1=new ThisKeyword_July09();
		t1.student_details(12,"Reddy",12345);
		System.out.println(t1.age); // it gives me the default value of int
		System.out.println(t1.name); // it gives me the default value of string
		System.out.println(t1.salary); // it gives me the default value of double
	}
}
