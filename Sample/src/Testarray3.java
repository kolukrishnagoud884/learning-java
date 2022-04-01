
public class Testarray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
		
		//3// 3//
		
		//0 1 2 [0,0]
		//3 4 5
		//6 7 8

		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		
		arr[1][0]=40;
		
		
		
		//printing 2D array  
		for(int i=0;i<3;i++){  
		 for(int j=0;j<3;j++){  
		   System.out.print(arr[i][j]+"---");  
		 }  
		 System.out.println();  
		}  
		
		
		
	}

}
