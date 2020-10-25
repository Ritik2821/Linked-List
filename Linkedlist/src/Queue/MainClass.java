package Queue;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue<Integer>mq=new MyQueue<>();
		
		mq.enqueue(12);
		mq.enqueue(2);
		mq.enqueue(123);
		mq.enqueue(25);
		
		System.out.print(mq.dequeue());
	}

}
