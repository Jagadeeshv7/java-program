public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int no = 153;
		int no2 = no;
		int arm = 0;
		while (no > 0) {
			int rem = no % 10;
			arm = (rem * rem * rem) + arm;
			no = no / 10;
		}
			if (arm == no2) 
			{
				System.out.println("It is a Armstrong Number");
			}
			else 
			{
				System.out.println("NOt an Armstrong Number");
			}
	}
}