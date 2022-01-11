public class NumberPattern18
{
	public static void main(String args[])
	{
		
			
			for (int row = 1; row <= 5; row++) {
			for (int column = 1; column <= row - 1; column++) {
				System.out.print("* ");
			}
			for (int last = 5; last >= row; last--) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
}