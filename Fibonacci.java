import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    System.out.print("N:");
	    int n=s.nextInt();
	    int a=0,b=1,c;
	    for(int i=0;i<=n;i++)
	    {
	        System.out.print(a+" ");
	        c=a+b;
	        a=b;
	        b=c;
	    }
	}
}
