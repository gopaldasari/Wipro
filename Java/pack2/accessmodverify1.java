package pack2;

import pack1.accessmod;

public class accessmodverify1 extends accessmod
{

	public static void main(String[] args) 
	{
		accessmodverify1 a = new accessmodverify1();
		//a.add(); //default
		a.sub();
		//a.mul(); //private
		a.div();
	}
}
