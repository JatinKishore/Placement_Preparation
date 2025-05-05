package Day2;


import java.util.*;

public class BFS{
    static List<List<Integer>> adjList=new ArrayList<>();
    static List<Integer> bfsList=new ArrayList<>();
    public static void CreateGraph(int u, int v)
    {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Nodes");
        int nodes=sc.nextInt();
        System.out.println("Enter Number of Edges");
        int edges=sc.nextInt();
        for(int i=0;i<nodes;i++)
        {
            adjList.add(new ArrayList<>());
        }
        System.out.println("Enter the Connections");
        for(int i=0;i<edges;i++)
        {
            int u=sc.nextInt();
            int v=sc.nextInt();
            CreateGraph(u,v);
        }
        boolean [] vis=new boolean [nodes];
        BFSTraversal(adjList,vis,0);
        for (int i=0;i<nodes;i++)
        {
            System.out.print(bfsList.get(i)+" ");
        }
    }

    private static void BFSTraversal(List<List<Integer>> adjList, boolean[] vis, int node) {
        Queue<Integer> bfsQueue=new LinkedList<>();
        bfsQueue.add(node);
        vis[node]=true;
        while(!bfsQueue.isEmpty())
        {
            int curr=bfsQueue.poll();
            bfsList.add(curr);
            for(int neighbour:adjList.get(curr))
            {
                if(!vis[neighbour])
                {
                    vis[neighbour]=true;
                    bfsQueue.add(neighbour);
                }
            }
        }
    }
}