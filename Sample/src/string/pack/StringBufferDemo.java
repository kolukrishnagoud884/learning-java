package string.pack;

public class StringBufferDemo {//Mutable

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Hello"); //addr 123 -Hello
	
		sb.append(" World"); //addr 123 - Hello World
		System.out.println(sb);

	}

}
