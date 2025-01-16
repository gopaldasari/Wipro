package pack9;

public class Thread_demo2 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		task1 t1 = new task1();//Main thread
		task2 t2 = new task2();//main thread 
		task3 t3 = new task3();//main thread 
		t1.start();//main thread + task1 thread
		t2.start();//main thread + task1 thread + task2 thread
		t3.start();
		t1.setName("Gopal-1 ");
		t2.setName("Gopal-2 ");
		t3.setName("Gopal-3 ");
		//t2.join();
		//t1.wait();
		
		//t1.interrupt();
		
		
		//t2.join();
		//t1.notifyAll();
		
		
		for(int i=0;i<4;i++)
		{
		Thread.sleep(2000);
		System.out.println("main thread "+Thread.currentThread().getName()+i);
		}
	}

}
 
class task1 extends Thread
{
	public void run()
	{
		try 
		{
			for(int i=0;i<4;i++)
			{
			Thread.sleep(2000);
			
			System.out.println("task-1 thread "+Thread.currentThread().getName()+i);
			}
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
}
class task2 extends Thread
{
	public void run()
	{
		try 
		{
			for(int i=0;i<6;i++)
			{
			Thread.sleep(2000);
			System.out.println("task-2 thread "+Thread.currentThread().getName()+i);
			}
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
}
class task3 extends Thread
{
	public void run()
	{
		try 
		{
			for(int i=0;i<6;i++)
			{
			Thread.sleep(2000);
			System.out.println("task-3 thread "+Thread.currentThread().getName()+i);
			}
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
}

