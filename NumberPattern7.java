public class NumberPattern7
{
	public static void main(String args[])
	{
        int end2 = 1;
		for (int s = 5; s >= 1; s--) {
			for (int i = s - 1; i >= end2; i--) {
				System.out.print(" ");

			}
			for (int j = 1; j <= 6 - s; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
