public class SBICustomer
{
	public static void main(String args[])
	{
		StateBank rep=new StateBank();
		rep.deposite();
		rep.withdraw();
		System.out.println(rep.minBalance);
	}
}