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
	
		for (int i=0;i<n ;i++ )
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			if( a >= b && a >= c)
            System.out.println("Alice");

        else if (b >= a && b >= c)
            System.out.println("Bob");

        else
            System.out.println("Charlie");
		}
	}
}
