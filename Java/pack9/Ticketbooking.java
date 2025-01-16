package pack9;

public class Ticketbooking 
{
	public static void main(String[] args) 
	{
		Tickets_avaliable  T = new Tickets_avaliable();
		Thread t1 = new Thread(T);
		Thread t2 = new Thread(T);
		t1.start();
		t2.start();
		t1.setName(": Thread 1");
		t2.setName(": Thread 2");
		

	}

}
class Tickets_avaliable implements Runnable
{
	int tck =1;
	public void run()
	{
		if(tck >= 1)
		{
			--tck;
			System.out.println("Booked the ticket sucessfully "+Thread.currentThread().getName());
		}
		else
		{
			System.out.println("Tickets are sold out");
		}
		
	}
}