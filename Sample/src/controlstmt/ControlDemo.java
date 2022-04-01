package controlstmt;

public class ControlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=15;
		
		int b=15;
		//{
			System.out.println("a+b");
		//}
		
		     //if
			//if else
			//if else if ladder
			//switch
			//for
			//while
			//do-while
			
			if(a<b)
			{
				System.out.println("The value of a is less than b");
			}
			
			
			
			
			if(a<b)
			{
				System.out.println("The value of a is less than b");
				
			}else
			{
				System.out.println("The value of a is greater than b");
			}
			
			
			if(a<b)
			{
				System.out.println("The value of a is less than b");
				
			}
			else if(b>a)
			{
				System.out.println("The value of a is greater than b");
			}else
			{
				System.out.println("The value of a and b is equal");
			}
			
			int c=1;
			
			switch(c)
			{
			case 1:
				System.out.println("case 1 matched");
				break;
				
			case 2:
				System.out.println("case 2matched");
				break;
				
				default:
					System.out.println("default");
	            break;
			}
			
			
			for(int i=0;  i<16;    i=i+4) {
			System.out.println(i);	
			}
			
			
			int i=0;
			while(i<16)
			{
				System.out.println(i);
				i=i+4;
			}
			
			
			int j=0;
			do {
				System.out.println(j);
				j=j+4;
			}while(j<16);
			
			
			
			
		
	}

}
