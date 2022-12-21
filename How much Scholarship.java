import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if ((n>0) && (n<=50) )
		{
			System.out.println("100");
		}
		else if ((n>50) && (n<=100))
		{
			System.out.println("50");
		}
		else
		{
			System.out.println("0");
		}
	}
}
