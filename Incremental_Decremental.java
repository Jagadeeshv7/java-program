public class Incremental_Decremental {

	public static void main(String[] args) {
		int no = 5;
		System.out.println(no++ + no++); // 5(6)+6(7)=11
		System.out.println(no++ - no++); // 7(8)-8(9)=-1

		int a = 10, b = 20;
		System.out.println(a++ + b++); // 10(11)+20(21)=30

		int c = 10, d = 20;
		System.out.println(++c + ++d); // 11(11)+21(21)=32
		System.out.println(c); // 11
		System.out.println(d); // 21
		System.out.println(c--); // 11(10)
		System.out.println(d--); // 21(20)
		System.out.println(--c); // 9(9)
		System.out.println(--d); // 19(19)
		System.out.println(c + d); // 9+19=28
		System.out.println(d-- - c--); // 19(18)-9(8)=10

		int i = 5, j = 6, k = 7;
		System.out.println(i++ + j++ + k++ + i-- + j-- + k--);
		// 5(6)+6(7)+7(8)+6(5)+7(6)+8(7)=39
		System.out.println(i + j + k); // 5+6+7=18

		int x = 5, y = 6, z = 7;
		System.out.println(--x + --y + --z + x++ + y++ + z++);
		// 4(4)+5(5)+6(6)+4(5)+5(6)+6(7)=30
		System.out.println(--x + --y + --z + x++ + y++ + z++);
		// 4(4)+5(5)+6(6)+4(5)5(6)+6(7)=30
		System.out.println(x-- + y-- + z-- + x++ + y++ + z++);
		// 5(4)+6(5)+7(6)+4(5)+5(6)+6(7)=33
	}

}
