public class AdamNumber 
{	
   public static void main(String[] args) 
   {		
      int num=12;	
      int rev=0;		
      int revrevsqr=0;		
      int sqrnum=num*num;		
      while(num>0)		
      {			
         int rem=num%10;			
         rev=(rev*10)+rem;			
         num=num/10;		
      }		
      //System.out.println(rev);		
      int revsqr=rev*rev;		
      while(revsqr>0)		
      {			
         int rem2=revsqr%10;			
         revrevsqr=(revrevsqr*10)+rem2;
         revsqr=revsqr/10;		
      }		
      //System.out.println(revrevsqr);
      if(sqrnum==revrevsqr)		
      {	
         System.out.println("Adam number");		
      }
      else		
      {	
      System.out.println("Not Adam number");	
      }
   }
}