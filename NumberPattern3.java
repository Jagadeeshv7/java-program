public class NumberPattern3
{
	public static void main(String args[])
	{
		int end1 = 5;
		for (int s = 1; s <= 5; s++) {
			for (int i = s; i <= end1; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		int end2 = 1;
		for (int s = 5; s >= 1; s--) {
			for (int i = s; i >= end2; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
