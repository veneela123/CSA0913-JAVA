import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    System.out.print("N:");  
	    int n=s.nextInt();
	    int a[][]=new int[n][n];
	    int b[][]=new int[n][n];
	    int c[][]=new int[n][n];
	    System.out.println("Enter elements of A matrix");
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
    	    {
    	        a[i][j]=s.nextInt();
    	    }
	    }
	    System.out.println("Enter elements of A matrix");
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
    	    {
    	        b[i][j]=s.nextInt();
    	    }
	    }
	    System.out.println("Sum of matrix");
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
    	    {
    	        c[i][j]=a[i][j]+b[i][j];
    	        System.out.print(c[i][j]+" ");
    	    }
    	    System.out.println();
	    }
	}
}
