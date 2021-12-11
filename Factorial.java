//Factorial
package tamilnadu.chennai;

public class Factorial {

	public static void main(String[] args) {
		int factorial = 1;
		for (int no = 1; no <= 5; no++) {
			factorial = factorial * no;  //5*4*3*2*1=120
		}
		System.out.println("Factorial of 5 is " + factorial);

	}
}