package codeclubpractice;
import java.util.*;
public class intersectionsorted 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array1:");
		int n1=sc.nextInt();
		System.out.println("Enter the number of elements in array2:");
		int n2=sc.nextInt();
		int[] arr1=new int[n1];
		int[] arr2=new int[n2];
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		HashSet<Integer> set1=new HashSet<>();
		HashSet<Integer> set2=new HashSet<>();
		for(int i:arr1)
		{
			set1.add(i);
		}
		for(int i:arr2)
		{
			set2.add(i);
		}
		set1.retainAll(set2);
		for(int i:set1)
		{
			System.out.println(i);
		}
		
		

	}

}
