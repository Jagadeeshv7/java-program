public class Bank
{
	public static void main(String args[])
	{
		Bank manager=new Bank();
		double balance=manager.calculateinterest(100000);
		System.out.println(balance);
		balance=manager.calculateinterest(100000,5);
		System.out.println(balance);
		balance=manager.calculateinterest(100000,5,6.0f);
		System.out.println(balance);
		String customer=manager.calculateinterest(100000,"Jagadeesh");
		System.out.println(customer);
	}
	public double calculateinterest(int amount)
	{
		float interest=4.5f;
		double value=(amount*4.5)/100;
		return value;
	}
	public double calculateinterest(int amount,int year)
	{
		float interest=4.5f;
		double value=(amount*4.5)/100*year;
		return value;
	}
	public double calculateinterest(int p,int n,float r)
	{
		return p*n*(r/100);
	}
	public String calculateinterest(int amount,String name)
	{
		return name;
	}
}