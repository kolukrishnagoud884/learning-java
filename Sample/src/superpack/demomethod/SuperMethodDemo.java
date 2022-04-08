package superpack.demomethod;

class Animal{
	
	void eat()
	{
	System.out.println("Eating");
	}
}

class Dog extends Animal
{
	
	void bark()
	{
		System.out.println("Barking ");
		super.eat();//immediate parent method can be called using super keyword
	}
	
	
	
	
}




public class SuperMethodDemo {

	public static void main(String[] args) {
		
		
		Dog d= new Dog();
		d.bark();
				

	}

}
