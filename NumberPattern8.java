public class NumberPattern8
{
    public static void main(String args[])
    {
        for (int i = 6; i >= 1; i--) {
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < 7 - i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}

