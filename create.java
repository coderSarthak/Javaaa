import java.util.Scanner;
 			
			//program to check STRING PALINDORME
class create
{
  public static void main(String[] args)
  {
    int flag=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String: ");
    String num=sc.nextLine();
    for(int i=0;i<num.length();i++)
	{
	  if(num.charAt(i) != num.charAt(num.length()-i-1))
	    {
		flag=0;
		//sbreak;
	    }
	
        }
	if(flag==0)
        {
	 System.out.print("NOT PALINDROME"); 
	}
	else
	{
       	  System.out.print("string is palindrome");
	  
   	}
   }
  
}