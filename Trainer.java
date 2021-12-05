public class Trainer
{
	String dept="Java";
	String institute="Payilagam";
	public Trainer()
	{
	}
	public Trainer(String department,String instite)
	{
		dept=department;
		institute=instite;
	}
		
	private int salary=10000;
	public int getSalary()
	{
		return this.salary;
	}
	public void training()
	{
		System.out.println("I am the Trainer");
	}
	public static void main(String args[])
	{
		
	Trainer trainerKumar=new Trainer("CSE","Payilagam");
	}
	
}

public class SQLTrainer extends Trainer
{
	public static void main(String args[])
	{
		SQLTrainer ram=new SQLTrainer();
		ram.training();
		System.out.println("Salary:"+ram.getSalary());
		System.out.println("Department is "+ram.dept);
		System.out.println("Institute is "+ram.institute);
	}
}