package superpack.demo;




class Animal
{
	String color="White";
	
}

class Dog extends Animal
{
	
  String color ="Black";	
  
  
  void printColor()
  {
	  System.out.println(color);
	  System.out.println(super.color); //we can access immediate parent instance variable: color:animal
  }
	
}


public class SuperDemo {

	public static void main(String[] args) {
		Dog d= new Dog();
		d.printColor();

	}

}
