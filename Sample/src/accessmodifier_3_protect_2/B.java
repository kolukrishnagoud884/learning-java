package accessmodifier_3_protect_2;

import accessmodifier_3_protect_1.A;

public class B  extends A{
	
	public static void main(String args[])
	{
		B obj= new B();
		obj.msg(); //protected method can be accesed via inheritance
	}
	
}
