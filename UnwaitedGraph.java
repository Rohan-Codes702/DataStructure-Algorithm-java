package GraphDataStructure.java;

import java.util.ArrayList;

public class UnwaitedGraph {

    static class edge
    {
        int src;
        int dest;

        edge(int src,int dest)
        {
            this.dest=dest;
            this.src=src;
        }
    }
    public static void crategraph(ArrayList<edge>graph[])
    {
        for (int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<edge>();
        }
        graph[0].add(new edge(0,1));
        graph[1].add(new edge(1,0));
        graph[2].add(new edge(2,1));
        graph[2].add(new edge(2,3));
        graph[2].add(new edge(2,0));


    }

    public static void main(String[] args) {
        int v=4;

        ArrayList<edge>graph[]=new ArrayList[v];
        crategraph(graph);

        for (int i=0;i<graph[2].size();i++)
        {
            edge e=graph[2].get(i);
            System.out.println(e.dest+" ");
        }
    }
}
