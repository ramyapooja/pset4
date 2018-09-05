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
		String str=sc.nextLine();
		int a=0;
		int b=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
				a++;
			else if(str.charAt(i)==')')
				b++;
		}
		if(a==b)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
