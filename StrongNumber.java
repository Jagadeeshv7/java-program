public class StrongNumber 
{	
    public static void main(String[] args)
    {		
         int no=145;int sum=0;int temp=no;
         while(no>0)
         {
              int fact=1;
              int i=1;
              int rem=no%10;
              while(i<=rem)
              {
                  fact=fact*i;
                  i++;
              }
              sum=sum+fact;
              no=no/10;
        }
        if(sum==temp)
        {
           System.out.println("Strong number");
        }
        else
        {
           System.out.println("Not a strong number");
        }
    }
}