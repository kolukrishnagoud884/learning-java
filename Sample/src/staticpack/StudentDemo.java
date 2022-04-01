package staticpack;


class Student
{
	
	static
	{
		System.out.println("welcome to college website");
		
	}
	
	
	int id;
	
	String name;
	
	static String college="IIT";  //not object its class level common for all object
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+college);
		
	}
	
}

public class StudentDemo {

	public static void main(String[] args) {
		
		Student.college= "NIIT";//static variable is acccessed via class name not object
		
		Student s1=new Student(100,"sam");
		
		
		Student s2=new Student(200,"ram");
		
		
		s1.display();
		
		s2.display();

	}

}
