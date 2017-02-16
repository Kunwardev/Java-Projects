
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */

class UniformCostSearch
{
    private PriorityQueue<Node> priorityQueue;
    private Set<Integer> settled;
    private int distances[];
    private int numberOfNodes;
    private int adjacencyMatrix[][];
    public LinkedList<Integer> path;
    private int[] parent;
    private int source, destination;
    public static final int MAX_VALUE = 999; 
 
    public UniformCostSearch(int numberOfNodes)
    {
        this.numberOfNodes = numberOfNodes;
        this.settled = new HashSet<Integer>();
        this.priorityQueue = new PriorityQueue<>(numberOfNodes, new Node());
        this.distances = new int[numberOfNodes + 1];
        this.path = new LinkedList<Integer>();
        this.adjacencyMatrix = new int[numberOfNodes + 1][numberOfNodes + 1]; 
        this.parent = new int[numberOfNodes + 1];
    }
 
    public int uniformCostSearch(int adjacencyMatrix[][], int source, int destination)
    {
        int evaluationNode;
        this.source = source;
        this.destination = destination;
 
        for (int i = 1; i <= numberOfNodes; i++)
        {
            distances[i] = MAX_VALUE;
        }
 
        for (int sourcevertex = 1; sourcevertex <= numberOfNodes; sourcevertex++)
        {
            for (int destinationvertex = 1; destinationvertex <= numberOfNodes; destinationvertex++)
            {
                this.adjacencyMatrix[sourcevertex][destinationvertex] =
                       adjacencyMatrix[sourcevertex][destinationvertex];
	    }
        }
 
        priorityQueue.add(new Node(source, 0));
        distances[source] = 0;
        long start = System.currentTimeMillis();
        
        while (!priorityQueue.isEmpty())
        {
            evaluationNode = getNodeWithMinDistanceFromPriorityQueue();
            //System.out.println("The eval Node is " + evaluationNode);
            if (evaluationNode == destination)
            {
                return distances[destination];
            } 
            long stop = System.currentTimeMillis();
            //System.out.println(stop-start);
            if(stop - start >= 5)
                return 0;
            settled.add(evaluationNode);
            addFrontiersToQueue(evaluationNode);
        }
        return distances[destination];
    }
 
    private void addFrontiersToQueue(int evaluationNode)
    {
        for (int destination = 1; destination <= numberOfNodes; destination++)
        {
            if (!settled.contains(destination))
            {
                if (adjacencyMatrix[evaluationNode][destination] != MAX_VALUE)
                {
                    if (distances[destination] > adjacencyMatrix[evaluationNode][destination]  
                                    + distances[evaluationNode])
                    {
                        distances[destination] = adjacencyMatrix[evaluationNode][destination]	
                                               + distances[evaluationNode]; 				 		
                        parent[destination] = evaluationNode;
                    }
 
                    Node node = new Node(destination, distances[destination]);
                    if (priorityQueue.contains(node))
                    {
                        priorityQueue.remove(node);
                    }
                    priorityQueue.add(node);
                }
            }
        }
    }
 
    private int getNodeWithMinDistanceFromPriorityQueue()
    {
        Node node = priorityQueue.remove();
        return node.node;
    }
 
    public void printPath()
    {
        path.add(destination);
        boolean found = false;
        int vertex = destination;
        while (!found)
        {
            if (vertex == source)
            {
                found = true;
                continue;
            }
            path.add(parent[vertex]);
            vertex = parent[vertex];
        }       
    }
}

public class FinalTry
{
    private static String line;
    public static HashSet<String> hp ;
    public static ArrayList<String> copy;
    
    
    private static int getIndex(String name){
        int p=-1;
        if(copy.contains(name)){
            for(int i=0;i<copy.size();i++){
                if(copy.get(i).equals(name))
                    return i+1;
            }
        }
        return p;
    }
    
    
    
    public static void main(String[] args) throws IOException
    {
        hp = new HashSet<>();
        
        String fileName = "input1.txt";
        String split[];
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                if(line.equals("END OF INPUT"))
                    break;
                split = line.split(" ");
                
                hp.add((split[0]));
                hp.add((split[1]));
            }   
            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        /*
        Iterator<String> it = hp.iterator();
        while(it.hasNext()){
            String n = it.next();
            System.out.println(n);
        }*/
        copy = new ArrayList<>(hp);
        int[][] adjacencyMatrix = new int[hp.size()+1][hp.size()+1];
        
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                if(line.equals("END OF INPUT"))
                    break;
                split = line.split(" ");
                
                int i = getIndex(split[0]);
                int j = getIndex(split[1]);
                adjacencyMatrix[j][i] = adjacencyMatrix[i][j] = Integer.parseInt(split[2]);
                
            }   
            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        //System.out.println(hp.size());
        for(int i=0;i<adjacencyMatrix.length;i++){
            for(int j=0;j<adjacencyMatrix.length;j++){
                if(adjacencyMatrix[i][j] == 0)
                    adjacencyMatrix[i][j] = 9999;
                //System.out.print(adjacencyMatrix[i][j] + " ");
            }//System.out.println("");
        }
        
        UniformCostSearch ucs = new UniformCostSearch(copy.size());
        String source = "Luebeck";
        String destination = "Berlin";
        int src = getIndex(source);
        int dst = getIndex(destination);
        int distance = ucs.uniformCostSearch(adjacencyMatrix, src, dst);
        if(distance == 0)
            System.out.println("There is no path between "+source+" and "+destination);
        else{
            ucs.printPath();
            System.out.println("The Path between " +copy.get(src-1) + " and " + copy.get(dst-1)+ " is ");
            Iterator<Integer> iterator = ucs.path.descendingIterator();
            System.out.println(distance);
            while (iterator.hasNext())
            {
                System.out.print(copy.get(iterator.next()-1) + "\t");
            }
        }
    }
    
    
    public static String getName(int x){
        Iterator<String> it = hp.iterator();
        String a = "";
        while(x-- > 0)
            a = it.next();
        return a;
    }
    
}
