package pack6;

public class method_dispatch 
{

	public static void main(String[] args) 
	{
		ClassA a = new ClassA();
		a.meth1();
		ClassA a1 = new ClassB();
		a1.meth1();
		ClassB b = new ClassB();
		b.meth1();
//		ClassB b1 = new ClassA(); // because b is child and A is parent so it throws error
//		b1.meth1();
		

		

	}

}
class ClassA
{
	void meth1()
	{
		System.out.println("From ClassA");
	}
}
class ClassB extends ClassA
{
	void meth1()
	{
		System.out.println("From ClassB");
	}
}