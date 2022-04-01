package multiple.inheritance;




//To  achieve multiple inheritance we go for interface

interface Printable{
	void print(); ///it is not having the definition// only declaration
	
}

interface Drawable{
	void draw();
}

class A implements Printable, Drawable
{
	
	public void print()
	{
		System.out.println("Hello I am printable");
	}
	
	public void draw()
	{
		System.out.println("Hello I am drawable");
	}
}



public class MultipleInheritanceDemo {

	
	
	
	public static void main(String[] args) {
		
		A obj= new A();
		obj.print();
		obj.draw();

	}

}
