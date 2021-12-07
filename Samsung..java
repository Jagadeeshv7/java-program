//Expected Understanding: Abstraction, Inheritance, return keyword, Method Arguments, Constructor
/*1) Create an abstract class named ‘SmartPhone’
– Add the below abstract methods
– int call(int seconds)
– void sendMessage()
– void receiveCall()
– Add non abstract method void browse()
– print ‘SmartPhone browsing’ inside browse() method definition
– Have constructor as below.
public SmartPhone()
{
System.out.println(“Smartphone under development”);
}*/
/*2) Create class called ‘FactoryDemo’ as abstract subclass of SmartPhone
– Add the below abstract methods
– void verifyFingerPrint()
– void providePattern()
– Add non abstract method void browse()
– print ‘Factory Demo browsing’ inside browse() method definition
– Add variable boolean isOriginalPiece and assign ‘false’ as value.
– Add static variable int price and set value as 0.*/
public abstract class SmartPhone
{
	public abstract int call(int seconds);
	public abstract void sendMessage();
	public abstract void receiveCall();
	public void browse()
	{
		System.out.println("Smart Phone browsing");
	}
	public SmartPhone()
	{
		System.out.println("Smart Phone under development");
	}
}

public abstract class FactoryDemo extends SmartPhone
{
	public abstract void verifyFingerPrint();
	public abstract void providePattern();
	public void browse()
	{
		System.out.println("Factory Demo browsing");
	}
	boolean isOriginalPiece=false;
	static int price=0;
}

class Samsung extends FactoryDemo
{
	static int price=5000;
	public void sendMessage()
	{
		System.out.println("Messaged sent");
	}
	public void receiveCall()
	{
		 System.out.println("Call received");
	}
	public int call(int second)
	{
		System.out.println("Calling");
		return 60;
	}
	public void verifyFingerPrint()
	{
		System.out.println("Finger print verified");
	}
	public void providePattern()
	{
		System.out.println("Pattern provided");
	}
	public static void main(String args[])
	{
	Samsung sam=new Samsung();
	System.out.println(Samsung.price);
	sam.sendMessage();
	sam.receiveCall();
	//System.out.println(sam.call());
	sam.verifyFingerPrint();
	sam.providePattern();
	sam.browse();
	}
}

/*output:
Smart Phone under development
5000
Messaged sent
Call received
Finger print verified
Pattern provided
Factory Demo browsing*/