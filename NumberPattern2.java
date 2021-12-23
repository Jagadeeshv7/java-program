public class NumberPattern2
{
	
	public static void main(String args[])
	{
		for (int s = 5; s >= 1; s--) 
		{
			for (int i = 1; i <= s; i++) 
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
		for (int s = 1; s <= 5; s++)
		{
			for (int i = 5; i >= s; i--) 
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

/*output:

1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 
*/