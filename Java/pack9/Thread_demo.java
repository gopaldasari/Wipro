package pack9;

public class Thread_demo 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		task t1 = new task();//Main method thread invoked by default by JVM
		t1.start(); //Invoke the task thread by using start() method
		
		for(int i=0;i<4;i++)
		{
		Thread.sleep(2000);
		System.out.println("main thread");
		}
	}

}
 
class task extends Thread
{
	public void run()
	{
		try 
		{
			for(int i=0;i<4;i++)
			{
			Thread.sleep(5000);
			System.out.println("task thread");
			}
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
}
