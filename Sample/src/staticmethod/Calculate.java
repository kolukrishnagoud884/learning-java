package staticmethod;


class Cube
{
  static int cubeCalc(int x) //takes int as paramater// return integer
	{
	return x*x*x;
	}
}



public class Calculate {
	
	
	
	

	public static void main(String[] args) {
	
		
		//Cube c=new Cube();
		int result =Cube.cubeCalc(5);// calling static method using class name 
		System.out.println(result);
		

	}

}
