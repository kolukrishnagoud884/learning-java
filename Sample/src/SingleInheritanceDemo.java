	

class Employer{
	
	float salary=40000;
}

class Programmer extends Employer{ // Programmer child // Employee is parent
	
int bonus=100000;


}



public class SingleInheritanceDemo {
	 

public static void main(String[] args) {
	
Programmer p=new Programmer();// by inheritance  we can access the parent properites by child object.

System.out.println("Programmer salary is:"+p.salary);

System.out.println("bonus of Programmer is:"+p.bonus);

}


}
