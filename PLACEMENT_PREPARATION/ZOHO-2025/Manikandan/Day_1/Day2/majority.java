package codeclubpractice;

import java.util.Scanner;

public class majority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array1:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int cnt=0;
		int cand=0;
		for(int i=0;i<arr.length;i++)
		{
			if(cnt==0)
			{
				cand=arr[i];
			}
			if(cand==arr[i])
			{
				cnt++;
			}
			else
			{
				cnt--;
			}
		}
		
		cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == cand) {
                cnt++;
            }
        }
		if(cnt>n/2)
		{
			System.out.println(cand);
		}
		else
		{
			System.out.println("-1");
		}

	}

}
