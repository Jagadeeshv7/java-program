public class ITcompany
{
	
	{
		System.out.println("Log IN");
	}
	protected ITcompany()
	{
		System.out.println("I am constructor");
	}
	public static void main (String args[])
	{
		System.out.println("Main Method");
		ITcompany emp1=new ITcompany();
		//ITcompany emp2=new ITcompany();
		
	}
	static 
	{
		System.out.println("Internet ON");
		System.out.println("Swip ON");
	}
}