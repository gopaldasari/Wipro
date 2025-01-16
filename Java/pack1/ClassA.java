package pack1;

public class ClassA 
{
	int a=5;// instance variable or global variable
	int b=3;
	ClassA()// constructor
	{
		System.out.println("Constructor called");
	}
	void add()//it is user defined
	{
		int a =100;//belong to this method only  --- local variables
		int res1=a+b;
		System.out.println("Added two numbers = "+ res1);
	}
	void sub()//it is user defined
	{
		int res2=a-b;
		System.out.println("Subtracted two numbers = "+ res2);
	}
	void meth1()//it is user defined
	{
		System.out.println("Meth1 called");
	}
	public static void main(String[] args) //main method
	{
		System.out.println("Main method called");
		ClassA obj1 = new ClassA();
		obj1.meth1();
		obj1.add();
		obj1.sub();

		int x=obj1.a;
		System.out.println(x);
	}

}