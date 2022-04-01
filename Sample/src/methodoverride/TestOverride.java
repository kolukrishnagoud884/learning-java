package methodoverride;






class Vehicle{
	void run()
	{
		System.out.println("I am vehicle run");
	}
	
}

class Bike extends Vehicle
{

	void run()
	{
		System.out.println("I am Bike run");
	}
}

public class TestOverride {//Run time polymorphism

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b= new Bike();
		b.run();

	}

}
