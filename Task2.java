interface Actor
{
	boolean makeUpRequired=true;
	String address="Chennai";
	void act();
	void dance();
	void sing();
}

class ActorSivakumar implements Actor
{
	
	public void act()
	{
		System.out.println("Suriya Good actor");
	}
	public void dance()
	{
		System.out.println("Suriya Normal dancer");
	}
	public void sing()
	{
		System.out.println("Suriya Normal singer");
	}
	public ActorSivakumar()
	{
	}
	public ActorSivakumar(int age,String car)
	{
		System.out.println("Age of Sivakumar:"+age);
		System.out.println("Name of the car:"+car);
	}
	static String address="Coimbatore";
	public void speaking()
	{
		System.out.println("Sivakumar Good speaker");
	} 
	public static void main(String args[])
	{
		ActorSivakumar as=new ActorSivakumar(65,"Audi Car");
		as.act();
		as.dance();
		as.sing();
		as.speaking();
		System.out.println("Sivakumar living in "+ActorSivakumar.address);
		System.out.println("____________________");
		Actor ac=new ActorSivakumar();
		ac.act();
		ac.dance();
		ac.sing();
		//ac.speaking(); 
		System.out.println("Suriya living in "+ac.address);
	}
}

/*output:
Age of Sivakumar:65
Name of the car:Audi Car
Suriya Good actor
Suriya Normal dancer
Suriya Normal singer
Sivakumar Good speaker
Sivakumar living in Coimbatore
____________________
Suriya Good actor
Suriya Normal dancer
Suriya Normal singer
Suriya living in Chennai*/