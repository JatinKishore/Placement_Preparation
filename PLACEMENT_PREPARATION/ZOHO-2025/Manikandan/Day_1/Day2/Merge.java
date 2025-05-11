package codeclubpractice;

import java.util.Arrays;
import java.util.Scanner;

public class mergesortedarray 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in arr1:");
		int n1=sc.nextInt();
		System.out.println("Enter the number of elements in arr2:");
		int n2=sc.nextInt();
		int arr1[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int arr2[]=new int[n2];
		for(int i=0;i<n2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int res[]=new int[n1+n2];
		int poin=0;
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				res[poin++]=arr1[i];
				i++;
			}
			else
			{
				res[poin++]=arr2[j];
				j++;
			}
			
		}
		while(i<arr1.length)
		{
			res[poin++]=arr1[i];
			i++;
		}
		while(j<arr2.length)
		{
			res[poin++]=arr2[j];
			j++;
		}
		System.out.println(Arrays.toString(res));
		
	}

}
