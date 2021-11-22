public class Bike
{
	static String bikebrand="Royal Enfield";
	static String model="Thunder Bird";
	public static void main(String args[])
	{
		System.out.println("Name of the Bike:"+bikebrand);
		System.out.println("Model of the Bike:"+model);
		Bike bike=new Bike();
		int mileage=bike.mileage();
		System.out.println("Mileage of the bike:"+mileage);
	}
	public int mileage()
	{
		return 40;
	}
}