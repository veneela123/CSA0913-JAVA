import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    System.out.print("N:");
	    int n=s.nextInt();
	    if(n%2==0)
	    {
	        System.out.println("Even number");
	    }
	    else
	    {
	        System.out.println("Odd number");
	    }
	}
}
