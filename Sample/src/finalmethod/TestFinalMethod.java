package finalmethod;


class Bike // If i introduce final keyword to class i cannot extend it in subclass
{
	final void run()
	{
	System.out.println("bike run");	
	}
	
}

class Honda extends Bike
{
	/*we cannot  override final method
	 * void run() { System.out.println("honda run"); }
	 */
}

public class TestFinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda h=new Honda();
		h.run();

	}

}
