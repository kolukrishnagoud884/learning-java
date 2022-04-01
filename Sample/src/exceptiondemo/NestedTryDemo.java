package exceptiondemo;

public record NestedTryDemo() {

	public static void main(String[] args) {
		
		
		try {
			
			
			try
			{
				int b=20/0;
			}catch(ArithmeticException e )
			{
				System.out.println(e);
			}
			
			int c=30/0;
			
		}catch(Exception  e)
		{
         System.out.println(e);
         }
		finally
		{
			System.out.println(" I am finally block");
		}
		
		
		
		
		// TODO Auto-generated method stub

	}
	
	

}
