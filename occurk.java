/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		int k=sc.nextInt();
		int c=0;
		long r=0;
		while(n>0)
		{
			r=n%10;
			if(r==k)
				c++;
			n=n/10;
		}
		System.out.println(c);
	}
}
