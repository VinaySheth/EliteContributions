//T.C.=O(n2)

import java.util.*;
class P23
{
	public static int sumPair(int a[],int k)
	{
		int i,j,count=0;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==k)
				{
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements:");
		int i,k,ans;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter sum element:");
		k=sc.nextInt();
		System.out.println("Array :");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		ans=sumPair(a,k);
		System.out.println("Count: "+ans);
	}
}