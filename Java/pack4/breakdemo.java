package pack4;

public class breakdemo 
{
	public void brdemo()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				break;
			System.out.println(i);
		}
		System.out.println("loop completed");
	}
	public static void main(String[] args) 
	{
		breakdemo br = new breakdemo();
		br.brdemo();

	}

}
