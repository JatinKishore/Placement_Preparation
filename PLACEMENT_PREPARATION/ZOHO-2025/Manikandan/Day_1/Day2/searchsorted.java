package codeclubpractice;

import java.util.Scanner;

import java.util.*;
public class searchrotated {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		System.out.println("Enter the target value:");
		int target=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int i=0;
		int j=arr.length-1;
		int ans=-1;
		while(i<j)
		{
			int mid=(i+j)/2;
			if(arr[i]<=arr[mid])
			{
				if(arr[mid]==target)
				{
					ans=mid;
					break;
				}
				if(arr[i]<=target && arr[mid]>=target)
				{
					j=mid-1;
				}
				else
				{
					i=mid+1;
				}
			}
			else
			{
				if(arr[mid]==target)
				{
					ans=mid;
					break;
				}
				if(arr[mid]<=target && arr[j]>=target)
				{
					i=mid+1;
				}
				else
				{
					j=mid-1;
				}
			}
		}
		System.out.println(ans);
		
	}

}
