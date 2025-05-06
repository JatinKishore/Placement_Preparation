import java.util.*;
class FIVE {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       System.out.print(kadane(arr,n));
    }
    public static int kadane(int[]arr,int n)
    {
    	float len=n/2;
    	int total = 0;
    	boolean b = false;
    	for(int i=0;i<n;i++) {
    		if(arr[i]<0)
    		{
    			b=true;
    			//int len1 =(int)Math.round(n);
    			//return subarr(len1,n,arr);
    		}
    		else if(arr[i]>0)
    		{
    			total+=arr[i];
    			
    		}
    		else
    		{
    			return 0;
    		}
    	}
    	if(b)
    	{
    		//int len1 =(int)Math.round(n);
			//return subarr(len1,n,arr);
    		int sarr1=0;
        		int sarr2=0;
    		for(int j=0;j<len;j++)
    		{
    			sarr1+=arr[j];
    		}
    		for(int k=(int) len;k<n;k++)
    		{
    			sarr2+=arr[k];
    		}
    		if(sarr1<sarr2)
    		{
    			return sarr2;
    		}
    		else {
    			return sarr1;
    		}
    	}
    	return total;
    }
