import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Queue<String>q = new LinkedList<>();
       q.add("3");
       q.add("4");
       int n = sc.nextInt();
       String res = "";
       for(int i = 1 ; i <= n ; i++){
            res = q.poll();
           q.add(res+"3");
           q.add(res+"4");
       }
       System.out.println(res);
    }
}
