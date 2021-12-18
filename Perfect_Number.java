public class Perfect_Number {
	public static void main(String[] args) {
		int no=28;
		int prft=0;
		int i=1;
		while(i<=no/2)
		{
			if(no%i==0)
			{
				prft=prft+i;
			}
			i++;
		}
		if(prft==no)
		{
			System.out.println("Prefect number");
		}
		else
		{
			System.out.println("Not a perfect number");
		}
	}
}