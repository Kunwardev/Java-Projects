/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

/**
 *
 * @author Kunwar
 */
public class Prim
{
    // Number of vertices in the graph
    private static final int V=10000;
 
    // A utility function to find the vertex with minimum key
    // value, from the set of vertices not yet included in Prim
    int minKey(int key[], Boolean mstSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index=-1;
 
        for (int v = 0; v < V; v++)
            if (mstSet[v] == false && key[v] < min)
            {
                min = key[v];
                min_index = v;
            }
 
        return min_index;
    }
 
    // A utility function to print the constructed Prim stored in
    // parent[]
    void printMST(int parent[], int n, int graph[][])
    {
        System.out.println("Edge   Weight");
        for (int i = 1; i < V; i++)
            System.out.println(parent[i]+" - "+ i+"    "+
                               graph[i][parent[i]]);
    }
 
    // Function to construct and print Prim for a graph represented
    //  using adjacency matrix representation
    void primMST(int graph[][])
    {   int parent[] = new int[V];
        int key[] = new int [V];
        Boolean mstSet[] = new Boolean[V];
        for (int i = 0; i < V; i++)
        {   key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;}
        key[0] = 0;     // Make key 0 so that this vertex is
        parent[0] = -1; // First node is always root of Prim
        for (int count = 0; count < V-1; count++)
        {
            int u = minKey(key, mstSet);
            mstSet[u] = true;
           for (int v = 0; v < V; v++)
              if (graph[u][v]!=0 && mstSet[v] == false &&
                    graph[u][v] <  key[v])
                {
                    parent[v]  = u;
                    key[v] = graph[u][v];
                }
        }
        printMST(parent, V, graph);
    }
 
    public static void main (String[] args)
    {
        /* Let us create following weighted graph
                 10
            0--------1
            |  \     |
           6|   5\   |15
            |      \ |
            2--------3
                4       */
        Prim t = new Prim();
        int graph[][] = new int[10000][10000];
        long start = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            for(int j=0;j<10000;j++){
                graph[i][j] = (int)(Math.random()*100 + 1);
            }
        }
 
        // Print the solution
        t.primMST(graph);
        long stop = System.currentTimeMillis();
        System.out.println(stop-start);
    }
}