package finalpack.new1;



class Vehicle
{
	
	
	final void run()
	{
		System.out.println("Vechicle");
	}
	
}

class Bike extends  Vehicle
{
	
	//void run() //we cannot override the final method
	//{
		
	//}
	
}



public class FinalMethodDemo {

	public static void main(String[] args) {
		

		Vehicle v= new Vehicle();
		v.run();
	}

}
