package operators;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	++; postfix ,prefix
	//	--; postfix ,prefix
		
		int a=10;
		System.out.println(a++); //11
		System.out.println(++a);//12
		System.out.println(a--);//11
		System.out.println(--a);//10
		
		boolean b=true;
		
		a=11;//(0  to 11)
		a=12;//(//(0 to 12)
		System.out.println(~a);
		System.out.println(!b);
		
		

	}

}
