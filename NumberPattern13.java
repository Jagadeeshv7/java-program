public class NumberPattern13
{
	public static void main(String args[])
	{
		for (int i = 1; i <= 5; i++) {
			for (int j = 7 - i; j <= 5; j++) {
				System.out.print(" " + " ");
			}
			for (int k = i; k <= 5; k++) {
				System.out.print(k + " ");
			}
			System.out.println();

		}
	}
}