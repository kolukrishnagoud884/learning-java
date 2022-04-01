package exceptiondemo;

public class DivideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=0;
		
		try {
		//int c=a/b;
			
		/*
		 * String s=null; System.out.println(s.length());//NullPointerException
		 */	
		/*
		 * String s="abc"; int i=Integer.parseInt(s);//NumberFormatException
		 */			
			
			int arr[]=new int[5];  
			arr[10]=50; //ArrayIndexOutOfBoundsException  	
			
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Multiplication begins"); 
		int d=a*b;
		System.out.println("Multiplication "+d); 
		
		

	}

}
