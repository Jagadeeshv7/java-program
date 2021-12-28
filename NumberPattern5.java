public class NumberPattern5
{
    public static void main(String args[])
    {
for (int s = 1; s <= 5; s++) {
			for (int i = 1; i <= s; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		for (int s = 5; s >= 1; s--) {
			for (int i = 5; i >= s; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
