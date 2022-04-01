package inner.pack;

public class TestMemberOuter {
	
	int data=100;
	
	class Inner
	{
		void msg()
		{
			System.out.println("data "+ data);
		}
	}
	

	public static void main(String[] args) {
		
   
		TestMemberOuter obj= new TestMemberOuter();
		
		TestMemberOuter.Inner in =obj.new Inner();
		
		in.msg();
		
		
	}

}
