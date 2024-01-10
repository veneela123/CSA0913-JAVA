import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    System.out.print("N:");
	    int n=s.nextInt();
	    int a[]=new int[n];
	    int temp[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=s.nextInt();
	        temp[i]+=a[i];
	    }
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(temp[i]+" ");
	    }
	}
}
