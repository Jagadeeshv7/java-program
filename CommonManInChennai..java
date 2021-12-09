/*Expected Understanding: Interface, access modifiers, Method Overriding.
1) Create a package called tamilnadu.chennai
2) Create an interface ‘TrafficRules’ under this package
3) Make sure this interface is public interface
– Add variable String trafficCommisssioner = “Kavin”;
– Add below methods
– void goByDieselVehicle();
– void goByBicycle();
4) Create class called ‘CommonManInChennai’ with main method in the same package tamilnadu.chennai
– Implement interface ‘TrafficRulesChennai’
– Create instance for this class and access all the methods
5) Now, create another package called ‘india.newDelhi’
6) Create an interface ‘TrafficRulesDelhi’ under this package
7) Make sure this interface is not public interface – it should be default interface
– Add variable String trafficCommisssioner = “Navin”;
– Add below methods
– void dontGoByDieselVehicle();
– void goByBicycle();
8) Create class called ‘CommonManInDelhi’ with main method in the same package india.newDelhi
– Implement interface ‘TrafficRulesDelhi’
– Create instance for this class and access all the methods
– Now, implement interface ‘TrafficRulesChennai’ also.
– Add unimplemented methods
– Access all the methods and observe the difference.*/
package tamilnadu.chennai;
public interface TrafficRulesChennai
{
	String trafficCommissioner="Kavin";
	void goByDieselVehicle();
	void goByBicycle();
}

package tamilnadu.chennai;
public class CommonManInChennai implements TrafficRulesChennai
{
	public static void main(String args[])
	{
		CommonManInChennai mc=new CommonManInChennai();
		System.out.println("Traffic Commissioner is "+mc.trafficCommissioner);
		mc.goByDieselVehicle();
		mc.goByBicycle();
	}
	public void goByDieselVehicle()
	{
		System.out.println("Use a Diesel Vehicle to Travel");
	}
	public void goByBicycle()
	{
		System.out.println("Use Bicycle to Travel");
	}
}

package india.newDelhi;
public interface TrafficRulesDelhi
{
	String trafficCommissioner="Navin";
	void dontGoByDieselVehicle();
	void goByBicycle();
}

package india.newDelhi;
class CommonMainInDelhi implements TrafficRulesDelhi//,TrafficRulesChennai
{
	public static void main(String args[])
	{
		CommonMainInDelhi md=new CommonMainInDelhi();
		System.out.println("Traffic Commissioner is "+trafficCommissioner);
		md.dontGoByDieselVehicle();
		md.goByBicycle();
	}
	public void dontGoByDieselVehicle()
	{
		System.out.println("Don't use Diesel Vehicle to Travel");
	}
	public void goByBicycle()
	{
		System.out.println("Use Bicycle to Travel");
	}
}

/*output:
Traffic Commissioner is Kavin
Use a Diesel Vehicle to Travel
Use Bicycle to Travel

Traffic Commissioner is Navin
Don't use Diesel Vehicle to Travel
Use Bicycle to Travel*/