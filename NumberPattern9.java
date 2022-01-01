public class NumberPattern9
{
    public static void main(String args[])
    {   
        for(int i=5;i>=1;i--)
        {
            for(int k=i-1;k>=1;k--)
            {
                System.out.print(" "+" ");
            }
            for(int j=i;j<=5;j++)
            {
                 System.out.print(i+" ");
             }
             System.out.println();
        }
    }
}
