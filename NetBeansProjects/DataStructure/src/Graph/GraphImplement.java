
package Graph;

import java.util.Scanner;


class Neighbours{
    public int vertexNum;
    public Neighbours Next;

    public Neighbours(int ver, Neighbours nbr)
    {
        this.vertexNum = ver;
        Next = nbr;
    }
}

class Edges{
    public String name;
    public Neighbours adjList;
    
    Edges(String name, Neighbours nbrs)
    {
        this.name = name;
        this.adjList = nbrs;
    }
}

public class GraphImplement
{
    Edges adjlists[];
    public GraphImplement(int v)
    {
        Scanner in = new Scanner(System.in);
        adjlists = new Edges[v];
        for(int i=0;i<v;i++)
        {
            adjlists[i] = new Edges(in.next(), null);
        }
        
        for(int i=0;i<2;i++)
        {
        int v1 = indexForName(in.next());
        int v2 = indexForName(in.next());
        try{
        adjlists[v1].adjList = new Neighbours(v2, adjlists[v1].adjList);
        adjlists[v2].adjList = new Neighbours(v1, adjlists[v2].adjList);}
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Something is wrong");
        }
        }
        Print();
    }
    
    public int indexForName(String name)
    {
        for(int v=0;v<adjlists.length;v++)
        {
            if(adjlists[v].name.equals(name))
                return v;
    }
        return -1;
}
    public void Print()
    {
        System.out.println("");
        for(int i=0;i<adjlists.length;i++)
        {
            try{
            System.out.print(adjlists[i].name);
            for(Neighbours nbr = adjlists[i].adjList;nbr!=null;nbr = nbr.Next)
                System.out.print("-->"+adjlists[nbr.vertexNum].name);
            System.out.println("");}
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("\nSomething is wrong with the above Vertex");
            }
    }
}
    public static void DFS(int v)
    {
        int count = 0;
        
    }
    
    public static void main(String[] args)
    {
        GraphImplement g = new GraphImplement(5);
    }
}