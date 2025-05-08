public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n ; i++){
      arr[i] = sc.nextInt();
    }
    int max = Integer.MAX_VALUE;
    for(int i = 0 ; i < n ; i++){
      currsum = Math.max(i,currsum+i);
      max = Math.max(max,currsum);
    }
    return max;
  }
}
