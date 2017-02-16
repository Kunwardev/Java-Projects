
import java.util.ArrayList;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */
/*
public class Node implements Comparator<Node>{
    String name;
    ArrayList<Node> child ;
    int cost;
    
    
    
    Node(String name){
        this.name = name;
        this.cost = 0;
    }
    
    Node(String name, int cost){
        this.name = name;
        this.cost = cost;
    }
    

    Node()
    {}

    public int compare(Node o1, Node o2)
    {
        if(o1.cost > o2.cost)
            return 1;
        return -1;
    }
}
*/

class Node implements Comparator<Node>
{
    public int node;
    public int cost;
    public String name;
    public Node()
    {
 
    }
    
    public Node(String name){
        this.name = name;
    }
    
    public Node(int node, int cost)
    {
        this.node = node;
        this.cost = cost;
    }
 
    @Override
    public int compare(Node node1, Node node2)
    {
        if (node1.cost < node2.cost)
            return -1;
        if (node1.cost > node2.cost)
            return 1;
        if (node1.node < node2.node)
            return -1;
        return 0;
    }
 
    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Node)
        {
            Node node = (Node) obj;
            if (this.node == node.node)
            {
                return true;
            }
        }
        return false;
    }
}