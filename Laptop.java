public class Laptop
{
	static String laptopmodel="HP 15 ryzen 5";
	static String brand="HP";
	public static void main(String args[])
	{
		System.out.println("Laptop model:"+Laptop.laptopmodel);
		System.out.println("Laptop brand:"+Laptop.brand);
		Laptop l1=new Laptop();
		String pc=l1.type("Jagadeesh");
		System.out.println(pc);
	}
	public String type(String s1)
	{
		System.out.println("My name is "+s1);
		return "Good Morning";
	}
}