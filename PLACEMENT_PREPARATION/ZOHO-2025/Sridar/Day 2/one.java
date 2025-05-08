// A java program to merge a two sorted array
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s1,s2;
        int k=0;
        System.out.print("Enter arr sizes");
        s1=sc.nextInt();
        s2=sc.nextInt();
        int[] arr1=new int[s1];
        int[] arr2=new int[s2];
        int[] res=new int[s1+s2];// result array
        for(int i=0;i<s1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int j=0;j<s2;j++)
        {
            arr2[j]=sc.nextInt();
        }
        // Algorithm
        int i=0,j=0;
        while(i<s1 && j<s2)
        {
            if(arr1[i]<arr2[j])
            {
                res[k]=arr1[i];
                k++;
                i++;
            }
            else if( arr1[i]==arr2[j])
            {
                res[k]=arr1[i];
                k++;
                j++;
                i++;
            }
            else
            {
                res[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<s1)
        {
            res[k++]=arr1[i++];
        }
        while(j<s2)
        {
            res[k++]=arr2[j++];
        }
        
        for(int value:res)
        {
            System.out.print(value+" ");
        }
    }
}
