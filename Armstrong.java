import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    System.out.print("N:");
	    int n=s.nextInt();
	    int rem,rev=0;
	    int temp=n;
	    while(temp!=0)
	    {
	        rem=temp%10;
	        rev=rev+rem*rem*rem;
	        temp=temp/10;
	    }
	    if(n==rev)
	    {
	        System.out.println("Armstrong");
	    }
	    else
	    {
	        System.out.println("Not a Armstrong");
	    }
	}
}
