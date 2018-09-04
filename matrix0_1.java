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
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		boolean flag=true;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((arr[i][j]==0)||(arr[i][j]==1))
					flag=true;
				else
				{
					flag=false;
					break;
				}
			}
		}
		if(flag==true)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
