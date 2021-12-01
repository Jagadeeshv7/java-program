public class GetSet 
{
  private String name; // private = restricted access

  // Getter
  public String getName() 
  {
    return name;
  }

  // Setter
  public void setName(String newName) 
  {
    this.name = newName;
  }


  public static void main(String[] args) 
  {
    GetSet myObj = new GetSet();
    myObj.setName("John"); // Set the value of the name variable to "John"
    System.out.println(myObj.getName());
  }
}