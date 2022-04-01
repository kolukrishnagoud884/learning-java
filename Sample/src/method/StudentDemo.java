package method;





class Student
{
	
	int id;
	String name;
	
	
	void assign(int i, String n)
	{
		id=i;
		name=n;
	}
	
}

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s= new Student();
		
		s.assign(100, "ram");
		
		System.out.print(s.id);
		System.out.print(s.name);

	}

}
