import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    System.out.print("N:");
	    int n=s.nextInt();
	    int sum=0;
	    for (int i=0;i<=n;i++)
	    {
	        sum+=i;
	    }
	    System.out.println("Sum:"+sum);
	}
}
