package finalpack;

class Bike
{
	final int speed =90;
	
	void run() {
		//speed=100;//we cannot change final variable
		System.out.println(speed);
		
	}
}




public class TestFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b= new Bike();
		b.run();

	}

}
