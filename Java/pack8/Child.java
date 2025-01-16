package pack8;

public class Child extends Demo implements C
{
	@Override
	public void run()
	{
		System.out.println("child  run");
	}
	@Override
	public void dispaly()
	{
		System.out.println("child  dispaly");
	}
	public static void main(String[] args) 
	{
		Child c = new Child();
		c.add();
		//	c.sub();
		c.mul();
		c.div();
		c.run();
		c.dispaly();
		

	}

	

}
