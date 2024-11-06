package GraphDataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSofGraph {
     static class edges
    {
        int src;
        int dest;

        edges(int src,int dest)
        {
            this.dest=dest;
            this.src=src;
        }
    }

    public static void crategraph (ArrayList<edges>[] graph)
    {
        for (int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<edges>();
        }
        graph[0].add(new edges(1,2));
        graph[0].add(new edges(1,3));
        graph[1].add(new edges(3,5));
    }

    public static void bfs(ArrayList<edges>[] graph,int v)
    {
        Queue<Integer>q=new LinkedList<>();
        boolean vis[]=new boolean[v];
        q.add(0);


        while (!q.isEmpty())
        {
            int curr=q.remove();
            if(vis[curr]==false)
            {
                System.out.println(curr+" ");
                vis[curr]=true;

                for (int i=0; i<graph[curr].size();i++)
                {
                    edges e=graph[curr].get(i);
                    q.add(e.dest);
                }

            }
        }
    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<edges>graph[]=new ArrayList[v];
        crategraph(graph);

        bfs(graph,v);
    }
}
