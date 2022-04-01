package methodoverloading;


class Adder
{
	
	static void add(int a,int b)
	{
	System.out.println("the sum is"+ (a+b));
	}

	static void add(int a,int b,int c)//everything is same except param
	{
	System.out.println("the sum is"+ (a+b+c));
	}
}



public class TestOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder.add(10, 30);
		Adder.add(10,20,30);

	}

}
