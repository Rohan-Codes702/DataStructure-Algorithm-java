package GraphDataStructure;

import java.util.ArrayList;

public class DfsGraph {
    static class edge1
    {
        int src;
        int dest;

        edge1(int src,int dest)
        {
            this.dest=dest;
            this.src=src;
        }
    }
    public static void creategraph(ArrayList<edge1>graph[])
    {
        for (int i=0;i< graph.length;i++)
        {
            graph[i]=new ArrayList<edge1>();
        }
        graph[1].add(new edge1(1,2));
        graph[1].add(new edge1(1,4));
        graph[2].add(new edge1(2,3));


    }

    public static void Dfs(ArrayList<edge1>graph[],int curr,boolean vis[])
    {
        System.out.println(curr+" ");
        vis[curr]=true;

        for (int i=0;i<graph[curr].size();i++)
        {
            edge1 e=graph[curr].get(i);
            if (vis[e.dest]==false)
            {
                Dfs(graph, e.dest, vis);
            }
        }
    }

    public static void main(String[] args)
    {
        int v=6;
        ArrayList<edge1>graph[]=new ArrayList[v];
        creategraph(graph);

        boolean vis[]=new boolean[v];
        Dfs(graph,1,vis);



    }
}
