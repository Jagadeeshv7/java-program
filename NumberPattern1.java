public class NumberPattern1
{
	
	public static void main(String args[])
	{
		for (int s = 1; s <= 5; s++) 
		{
			for (int i = 5; i >= s; i--) 
			{
				System.out.print(s + " ");
			}
			System.out.println();
		}
		for (int s = 5; s >= 1; s--)
		{
			for (int i = 1; i <= s; i++) 
			{
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}
}

/*output
First

1 1 1 1 1 
2 2 2 2 
3 3 3 
4 4 
5 
5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1 
*/