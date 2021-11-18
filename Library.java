public class Library
{
	static String libraryName="Abdul kalam Library";
	static String address="78/4 Gandhi Street,Ambattur,chennai-53";
	String bookName;
	String author;
	int pages;
	public Library(String s1,String s2,int i)
	{
		bookName = s1;
		author = s2;
		pages = i;
	}
	public static void main(String args[])
	{
		System.out.println("Name of the library:"+Library.libraryName);
		System.out.println("Address of the library:"+Library.address);
		
		Library book1=new Library("INDIA 2020","A.P.J.Abdul kalam",344);

		Library book2=new Library("RICH DAD POOR DAD","Robert Kiyosaki",336);
		
		Library book3=new Library("THINK AND GROW RICH","Napoleon Hill",225);
		
		book1.lend();
		book2.lend();
		book3.lend();
	}
	public void lend()
	{
		System.out.println("Name of the Book:"+bookName);
		System.out.println("Author of the Book:"+author);
		System.out.println("Number of pages in Book:"+pages);
	}
}