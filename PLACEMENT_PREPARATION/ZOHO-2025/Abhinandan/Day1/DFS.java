package Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DFS{
    static List<List<Integer>> adjList=new ArrayList<>();
    static List<Integer> dfsList=new ArrayList<>();
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
        DFSTraversal(adjList,vis,0);
        for (int i=0;i<nodes;i++)
        {
            System.out.print(dfsList.get(i)+" ");
        }
    }

    private static void DFSTraversal(List<List<Integer>> adjList, boolean[] vis, int node) {
        vis[node]=true;
        dfsList.add(node);
        for(int neighbour:adjList.get(node))
        {
            if(!vis[neighbour])
            {
                DFSTravesal(adjList,vis,neighbour);
            }
        }
    }
}