public class Fibonacci {

	public static void main(String[] args) {
		int first = -1, second = 1;
		int third = 0;
		while (third <= 55) {
			third = first + second;
			System.out.print(third + " ");
			first = second;
			second = third;
		}

	}

}
/*output:
0 1 1 2 3 5 8 13 21 34 55 89 
*/