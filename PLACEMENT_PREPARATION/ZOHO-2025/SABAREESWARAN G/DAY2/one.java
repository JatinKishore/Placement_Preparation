import java.util.*;

public class Intersection {
    public static int[] intersection(int[] a,int[] b){
        Set<Integer> set=new HashSet<>();
        Set<Integer> arr=new HashSet<>();

        for(int n:a){
            set.add(n);
        }
        for(int m:b){
            if(set.contains(m)){
                arr.add(m);
            }
        }
        return arr.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3,4,5,1};
        int[] b = {3,5,2, 2};

        int[] result = intersection(a, b);
        System.out.println("Intersection: " + Arrays.toString(result));
    }
}
