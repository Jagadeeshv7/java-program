public class NeonNumber {

	public static void main(String[] args) {
		int no = 9;
		int no1 = no;
		int neon = 0;
		for (int no2 = no * no; no2 > 0; no2 = no2 / 10) {
			int rem = no2 % 10;
			neon = rem + neon;
		}
		if (no1 == neon) {
			System.out.println("It is neon number");
		} else {
			System.out.println("It is not a neon number");
		}
	}

}