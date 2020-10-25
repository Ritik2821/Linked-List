package Stackandvector;

public class MainClass {

	public static void main(String[] args)throws Exception {
		MyStack<Integer>stack=new MyStack();
			
		stack.push(12);
		stack.push(15);
		stack.push(17);
		
		 int popped=stack.pop();
		 int peeked=stack.peek();
		 
		System.out.println(popped);
		System.out.println(peeked);
	}

}
