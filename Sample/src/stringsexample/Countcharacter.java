package stringsexample;

public class Countcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String string="You are turning Red";
int count=0;
for(int i=0;i<string.length();i++) {
	if(string.charAt(i) != ' ')
		count++;
}
		System.out.println("Number of characters in a string="+count);
	

	}

}
