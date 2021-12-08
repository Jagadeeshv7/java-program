*/Expected Understanding: Abstraction, Inheritance, Dynamic Binding, Polymorphism (Overriding), Constructor Overloading.
1) Create an abstract class called ‘India’
– Have below abstract methods
– void speakLanguage()
– void eat()
– void dress()
– Have static variable String capital = “New Delhi”
– Have below Constructor
public India(String primeMinister)
{
System.out.println(“our Prime Minister is” + primeMinister);
}
2) Create an abstract class called ‘SouthIndia’
– Make this class as sub class of ‘India’
– Add below non abstract methods
– void cultivate()
– Print ‘Rice and Wheat cultivation’ inside this method
– void livingStyle()
– Print ‘Average development’ inside the method.
3) Create a class called ‘TamilNadu’ with main method as sub class of ‘South India’.
– Add unimplemented methods
– Provide your own definitions wherever necessary.
– Have static variable String capital = “Chennai”
– Add below non abstract methods
– void cultivate()
– Print ‘Rice and Sugar cane cultivation’ inside this method
– void livingStyle()
– Print ‘Above Average development’ inside this method
– Using class name “India” – access variable ‘capital’ and print the value
– Using class name “TamilNadu” – access variable ‘capital’ and print the value.
– Create instance for “SouthIndia” as below
SouthIndia si = new TamilNadu()
– Observe which methods and variables can be accessed using ‘si’ and note down.
*/
public abstract class India
{
	abstract void speakLanguage();
	abstract void eat();
	abstract void dress();
	static String capital="New Delhi";
	public India()
	{
	}
	public India(String primeMinister)
	{
		System.out.println("Our Prime Minister is "+primeMinister);
	}
}

public abstract class SouthIndia extends India
{
	public SouthIndia()
	{
	}
	public SouthIndia(String primeMinister)
	{
		super(primeMinister);
	}
	void cultivate()
	{
		System.out.println("Rice and wheat cultivation");
	}
	void livingStyle()
	{
		System.out.println("Average development");
	}
}
	
public class TamilNadu extends SouthIndia
{
	public TamilNadu()
	{
	}
	public TamilNadu(String t)
	{
		super(t);
	}
	void speakLanguage()
	{
		System.out.println("Tamil Language");
	}
	void eat()
	{
		System.out.println("Biriyani");
	}
	void dress()
	{
		System.out.println("veti");
	}
	static String capital="Chennai";
	void cultivate()
	{
		System.out.println("Rice and sugar cane cultivation");
	}
	void livingStyle()
	{
		System.out.println("Above Average development");
	}
	public static void main(String args[])
	{
		System.out.println("Capital of India is "+India.capital);
		System.out.println("Capital of TamilNadu is "+TamilNadu.capital);
		SouthIndia si=new TamilNadu("Modi ji");
		si.speakLanguage();
		si.eat();
		si.dress();
		si.cultivate();
		si.livingStyle();
	}
}

/*output:
Capital of India is New Delhi
Capital of TamilNadu is Chennai
Our Prime Minister is Modi ji
Tamil Language
Biriyani
veti
Rice and sugar cane cultivation
Above Average development*/