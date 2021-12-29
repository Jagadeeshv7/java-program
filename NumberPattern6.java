public class NumberPattern6
{
	public static void main(String args[])
	{
		int s = 1;
		int e = 1;
		while (s <= 5) {
			for (int i = s; i <= e; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			s++;
			e = e + 2;
		}
		int s1 = 5;
		int e1 = 5;
		while (s1 >= 1) {
			for (int i = s1; i >= e1; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
			s1--;
			e1 = e1 - 2;
		}
	}
}