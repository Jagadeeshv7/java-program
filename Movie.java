public class Movie
{
	String favouritehero;
	String favouriteheroine;
	int shootingdays;
	public Movie(String s1,String s2,int i)
	{
		favouritehero=s1;
		favouriteheroine=s2;
		shootingdays=i;
	}
	public static void main(String args[])
	{
		Movie Bigil=new Movie("Vijay","Niyanthara",100);
		Bigil.thalapathy63();
	}
	public void thalapathy63()
	{
		System.out.println("Name of the Hero:"+favouritehero);
		System.out.println("Name of the Heroine:"+favouriteheroine);
		System.out.println("NUmber of days taken to shoot:"+shootingdays);
	}
}
	