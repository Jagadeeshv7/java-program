public class ReverseNumber {

	public static void main(String[] args) {
		int purse = 1234;
		int purse2 = purse;
		int reverse = 0;
		while (purse > 0) {
			int rem = purse % 10;
			reverse = (reverse * 10) + rem;
			purse = purse / 10;
		}
		System.out.println("Before reversing a number:" + purse2);
		System.out.println("After reversing a number:" + reverse);
	}

}
/*output:
Before reversing a number:1234
After reversing a number:4321
*/