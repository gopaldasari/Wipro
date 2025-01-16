package pack9;

public class priorityDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		A t1 = new A();
		B t2 = new B();
		System.out.println("main "+Thread.currentThread().getPriority());
		t1.start();
		t2.start();
//		t1.setPriority(10);
//		t2.setPriority(1);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		
		t1.setPriority(8);
		System.out.println("t1 "+t1.getPriority());
		
		int p=Thread.MAX_PRIORITY;
		t2.setPriority(p);
		System.out.println("t2 "+t2.getPriority());
		
		Thread.currentThread().setPriority(3);
		System.out.println("main "+Thread.currentThread().getPriority());
		//t1.sleep(2000);
		//System.out.println("child "+t1.getPriority());
		System.out.println("main method done");
	}

}
class A extends Thread
{
	public void run()
	{
		System.out.println("A done");
	}
}
class B extends Thread
{
	public void run()
	{
		System.out.println("B done");
	}
}