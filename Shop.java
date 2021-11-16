class Shop
{
	static String shopName="Periandavar Super Market";
	int count;
	String name;  // String-java class
	int price,discount; // primitive Datatypes
	public static void main(String args[])
	{
		System.out.println(Shop.shopName);
		
		Shop prod1=new Shop();
		prod1.name="abc";
		prod1.price=50;
		prod1.discount=5;
		
		Shop prod2=new Shop();
		prod2.name="pqr";
		prod2.price=100;
		prod2.discount=10;
		
		prod1.count=10;
		prod2.count=12;
		prod2.display();
		prod1.sell();
		prod2.sell();
		prod1.update();
		prod2.update();
		
	}
	public void display()  //object specific Method
	{
		System.out.println(name);
	}
	public void sell()
	{
		System.out.println(price-discount);
	}
	public void update()
	{
		count= count-1;
		System.out.println("Balance is "+count);
	}
}