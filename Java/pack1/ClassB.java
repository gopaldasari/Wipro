package pack1;

public class ClassB 
{
	int a=5;// instance variable or global variable
	int b=3;
	int sub()//it is user defined
	{
		int res1=a-b;
		return res1;
	}
	void multi(int c,float d)
	{
		int a=c;
		float b=d;
		float res2=a*b;
		System.out.println(res2);
	}
	float div(int e,float f)
	{
		int a=e;
		float b=f;
		float res3=a/b;
		return res3;
	}
	public static void main(String[] args) 
	{
		ClassB obj1 = new ClassB();
		int result =obj1.sub();
		System.out.println(result);
		obj1.multi(5, 9.5f);
		System.out.println(obj1.div(10, 2.5f));


	}

}
