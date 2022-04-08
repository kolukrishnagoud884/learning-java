package string.pack;




public class StringDemo {

	public static void main(String[] args) {
		

		String s1="Java"; // by literal --> only one instance in String constant pool memory
		
		String s2= new String("Test"); // by using new keyword  2 instance in String  constant pool memory+ heap memory
		
		System.out.println(s1);
		
		System.out.println(s2);
		
		String s3="Java";// in this case new instance created it will refer in string constant pool,if same it will use it
		
		System.out.println(s3);
		
		
	   //String is immutable
		
		String s4="Java"; // addres 123 -> Java
		
		s4=s4+"world";// addr 124-> Java World //to solve this they introduced String Buffer
		
	}

}
