//1.Two Sum

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n ; i++){
      arr[i] = sc.nextInt();
    }
    //[5,2] target = 7
    int target = sc.nextInt();
    HashMap<Integer,Integer>hm = new HashMap<>();
    for(int i = 0 ; i < n ; i++){
      int k = target - arr[i];
      if(hm.containsKey(k)){
        return true;
      }else{
        hm.put(nums[i]);
      }
    }
    return false;
  }
}




