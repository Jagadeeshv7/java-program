class A
{
     int a=3;
     void display()
     {
          int a=7;
          System.out.println(a);
          System.out.println(this.a);
     }
     public static void main(String args[])
     {
          A obj=new A();
          obj.display();
     }
}