package collectionspack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stk= new Stack<String>();
		
		stk.push("sam");
		stk.push("ram");
		
		
		stk.pop();
		
		for(String s: stk)
		{
		System.out.println(s);
		}

	}

}
