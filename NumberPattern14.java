public class NumberPattern14
{
	public static void main(String args[])
	{
		for (int i = 1; i <= 5; i++) {
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(" " + " ");
			}
			for (int k = i; k <= 5; k++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}