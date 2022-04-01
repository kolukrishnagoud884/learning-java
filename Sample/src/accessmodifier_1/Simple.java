package accessmodifier_1;





class A
{
	private int data=40;
	
	private void msg() {
		System.out.println("Hello Java");
	}
}

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a =new A();
		//a.msg();
		//System.out.println(a.data);

	}

}
