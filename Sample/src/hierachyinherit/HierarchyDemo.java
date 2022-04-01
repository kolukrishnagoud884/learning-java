package hierachyinherit;

class Animal{  
void eat(){System.out.println("eating...");}  
}  



class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  




class Cat extends Animal{  
void meow(){System.out.println("meowing...");}  
}  



public class HierarchyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.eat();
		c.meow();
		
		Dog d=new Dog();
		d.bark();
		d.eat();
		

	}

}
