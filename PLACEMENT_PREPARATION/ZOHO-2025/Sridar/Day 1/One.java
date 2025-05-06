
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter row and col");
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.println("Enter the array");
        //Array input
        int [][] arr=new int[row][col];
        int [][] trans=new int[col][row];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                int temp;
                arr[i][j]=sc.nextInt();
                trans[j][i]=arr[i][j];
            }
        }
        //rotation by 90degree ie., row only reverse using 2 pointer tech
        for(int i=0;i<row;i++)
        {
            int l=0;
            int r=row-1;
            while(l<r)
            {
                int temp=trans[i][l];
                trans[i][l]=trans[i][r];
                trans[i][r]=temp;
                l++;
                r--;
            }
        }
        //printing trans array + rotated array
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(trans[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
