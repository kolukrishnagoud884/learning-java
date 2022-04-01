package superkeyword;

class Animal
{
	String color ="White";
	
	void eat()
	{
		System.out.println("Eating");
	}
}

class Dog extends Animal{
	
	String color="black";
	
	void printColor()
	{
		System.out.println(color);
		System.out.println(super.color);//used to access immediate parent instance variable
		super.eat();//used to access immediate parent method also
	}
}




public class TestSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d= new Dog();
				d.printColor();

	}

}
