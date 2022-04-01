package stringfunctions;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Hello"; //literal //string constant pool  heap memory
		
		String s1="Hello";
		
		s1=s1+ "world"; //immutable
		
		System.out.println(s);
		
		
		String str1=new String("Hi");//string object
		
		System.out.println(str1);
		
		
	}

}
