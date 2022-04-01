package constructor;


class Student
{
	
	int id;
	String name;
	
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name; // this keyword refers to current invoking object
	}
	
	
}



public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student(200,"john");
		
		System.out.print(s.id);
		System.out.println(s.name);
		
Student s1=new Student(300,"sam");
		
		System.out.print(s1.id);
		System.out.print(s1.name);
		


	}

}
