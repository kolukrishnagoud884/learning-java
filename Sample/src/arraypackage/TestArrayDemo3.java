package arraypackage;

public class TestArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {{1,2,3},{2,4,5},{4,4,5}};
		
		/*
		 * 1 2 3 first row 3 column 1->0,0 2 ->0,1 3 ->0,2
		 * 
		 * 2 4 5 second row 3 column 2->1,0 4->1,1 5 ->1,2
		 * 
		 * 4 4 5 third row 
		 * 
		 */
		
		for(int i=0;i<3;i++)
		{
			
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
