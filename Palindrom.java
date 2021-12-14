//Palindrome or not
public class Palindrom {

	public static void main(String[] args) {
		int purse = 7337;
		int purse2 = purse;
		int reverse = 0;
		while (purse > 0) {
			int rem = purse % 10;
			reverse = (reverse * 10) + rem;
			purse = purse / 10;
		}
		System.out.println("Before reversing a number:" + purse2);
		System.out.println("After reversing a number:" + reverse);
		// upto this reverse a number
		// now palindrome

		if (purse2 == reverse) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

	}

}