package pack9;

public class Runnable_demo 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		job1 j1 = new job1();//Main method thread invoked by default by JVM
		job2 j2 = new job2();
		Thread t1 = new Thread();
		System.out.println(t1);
		
//		Thread t2 = new Thread(j2);
//		t1.start(); //Invoke the task thread by using start() method
//		t2.start();
//		t1.setName("Gopal-1");
//		t2.setName("Gopal-2");
		
		
		
		
		for(int i=0;i<4;i++)
		{
		Thread.sleep(2000);
		System.out.println("main thread "+Thread.currentThread().getName());
		}
		
	}

}
 
class job1 implements Runnable
{
	public void run()
	{
		try 
		{
			
			for(int i=0;i<4;i++)
			{
			Thread.sleep(1000);
			System.out.println("job-1 thread "+Thread.currentThread().getName());
			}
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
}
class job2 implements Runnable
{
	public void run()
	{
		try 
		{
			for(int i=0;i<6;i++)
			{
			Thread.sleep(2000);
			System.out.println("job-2 thread "+Thread.currentThread().getName());
			}
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
}
