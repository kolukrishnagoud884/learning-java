package interfaceExample;


interface Printable// interface keyword
{
	void print();// only declaration allowed
	
}

interface Drawable
{
	void draw();
}


class Operation implements Drawable,Printable // mutliple is achieved via Interface
{

	
   public void print() {//implementation
	System.out.println(" I am printing method");	
		
	}

   public void draw() {//implementation
	   System.out.println(" I am drawing method");
		
	}
	

	
	
}




public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Interface");
		
		Operation op =new Operation();
		op.print();
		op.draw();
		

	}

}
