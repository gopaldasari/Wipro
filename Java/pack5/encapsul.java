package pack5;

public class encapsul 
{
	public String name;
	private String pass;
	
	public void meth1()
	{
		System.out.println(name);
		System.out.println(pass);
	}
	
	

	public String getPass() 
	{
		return pass;
	}



	public void setPass(String pass) 
	{
		this.pass = pass;
	}



	public static void main(String[] args) 
	{
		encapsul e = new encapsul();
		e.name="john";
		e.pass="12345";
		e.meth1();

	}

}


