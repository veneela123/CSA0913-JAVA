import java.util.*;
public class reverse
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.print("Enter the word to be Reversed : ");
		String str=s.nextLine();
		String str2="";
		for(int i=str.length()-1;i>=0;i--)
		{
		    str2+=str.charAt(i);
		    
		}
		System.out.print("Reversed string : "+str2);
	}
}
