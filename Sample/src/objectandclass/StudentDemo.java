package objectandclass;



class Student
{
	//variable 
	
	int id;
	String studentName;
	
	
	//method
	
}



public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student();//creating object fors a class student by using new keyword
		
		s.id=123; // 1 reference way of assignment
		s.studentName="sam";
		
		
		System.out.println(s.id);
		System.out.print(s.studentName);

		
		
	}

}
