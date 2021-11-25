public class Kitchen
{
	String name;
	int experience;
	boolean non_veg=true;
	boolean veg=false;
	public Kitchen(String my_name,int my_experience)
	{
		name=my_name;
		experience=my_experience;
		System.out.println("Welcome "+my_name+"! You have "+my_experience+" months of cooking experience"); 
	}
	public static void main(String args[])
	{
		Kitchen chef=new Kitchen("Jagadeesh",2);
		String favourite_food=chef.prepareFood("Biryani");
		System.out.println("My favourite food is "+favourite_food);
		String favourite=chef.prepareFood("Biryani",2);
		System.out.println(favourite);
		chef.prepareFood("Tiffin","Biryani",2,true);
		chef.prepareFood(2,"Biryani");
	}
	public String prepareFood(String dish_name)
	{
		return dish_name;
	}
	public String prepareFood(String dish_name,int exp)
	{
		//System.out.println("My favourite food is "+dish_name);
		//System.out.println("My work experience as chef is "+exp+ " months");
		return dish_name+exp;
	}
	public void prepareFood(String mrng_food,String lunch,int exp,boolean non_veg)
	{
		System.out.println(mrng_food);
		System.out.println("My favourite food is "+lunch);
		System.out.println("My work experience as chef is "+exp+ " months");
		System.out.println(non_veg);
	}
	public void prepareFood(int exp,String dish_name)
	{
		System.out.println("My work experience as chef is "+exp+ " months");
		System.out.println("My favourite food is "+dish_name);
	}
}