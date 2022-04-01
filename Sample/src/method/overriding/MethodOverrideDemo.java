package method.overriding;








class Vehicle
{
void run()
{
	System.out.println("Running-Vehicle");
}
}





class Bike extends Vehicle
{
	void run()
	{
		System.out.println("Running-bike");
	}
}

public class MethodOverrideDemo {

	public static void main(String[] args) {
		

		Bike bike= new Bike();//Here we have assigned bike object the method in bike will executed
		bike.run();
		
		
		Vehicle objRef= new Vehicle();
		objRef.run();
		
		Vehicle objRef2= new Bike();
		objRef2.run();
		
		
		
	}

}
