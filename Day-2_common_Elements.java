import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    System.out.print("N:");  
	    int n=s.nextInt();
	    int a[]=new int[n];
	    int b[]=new int[n];
	    System.out.println("Enter elements of first array");
	    for(int i=0;i<n;i++)
	    {
    	    a[i]=s.nextInt();
	    }
	    System.out.println("Enter elements of second array");
	    for(int i=0;i<n;i++)
	    {
	        b[i]=s.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
    	   for(int j=0;j<n;j++)
    	   {
    	       if(a[i]==b[j])
    	        {
    	            System.out.println("Common element:"+a[i]);
    	        }
    	   }
	    }
	}
}
