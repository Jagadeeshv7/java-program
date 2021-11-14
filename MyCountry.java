public class MyCountry //class
{
	static String country_name="India";
	static int std_code=91;
	public static void main(String arg[]) //Main method
	{
		MyCountry Myself=new MyCountry(); // Object creation
		MyCountry MyBrother=new MyCountry(); // object creation
		System.out.println(MyCountry.country_name);
		System.out.println(MyCountry.std_code);
		Myself.roamingWithFriends(); 
		MyBrother.read();
		MyCountry.Election();
	}
	public static void Election()
	{
		System.out.println("Conducting Election");
	}
	public void roamingWithFriends() // Method 
	{
		System.out.println("Roaming");
	}
	public void read() // Method
	{
		System.out.println("Reading");
	}
	public void play() // Method
	{
		System.out.println("Playing");
	}
}
