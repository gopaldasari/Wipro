package pack8;

public class Demo implements A,B,C
{
	@Override
	public void add() 
	{
	
	}
	
	
	@Override
	public void sub(Input i) 
	{
		int a=88;
		System.out.println(a-i.age);
	}

	@Override
	public void mul() 
	{
			
	}

	@Override
	public void div() 
	{
		
	}
	@Override
	public void dispaly()
	{
		System.out.println("demo  dispaly");
	}
	@Override
	public void run() 
	{
		
	}
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		System.out.println(A.x);
		System.out.println(B.x);
		Input i = new Input();
		d.add();
		d.sub(i);
		d.mul();
		d.div();
		d.dispaly();

	}

}
