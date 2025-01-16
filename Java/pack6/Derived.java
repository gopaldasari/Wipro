package pack6;

	class Derived extends Base
	{
		public void writeData(String data)
		{
//			String d = data;
//			System.out.println(d);
			System.out.println("Data Written to the file");
		}
		public static void main (String args[])
		{
			try
			{
				
			new Derived().writeData("Hello World");
			}
			catch(Exception exe)
			{
				exe.printStackTrace();
			}
		}
	}
	class Base
	{
		public void writeData(String data)
		{
			System.out.println("Data Written");
		}
	}

