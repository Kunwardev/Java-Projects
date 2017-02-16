/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
 
public 
    public static void main(String... arg)
    {
        int adjacency_matrix[][];
        int number_of_vertices;
        int source = 0;
        int destination = 0;
        int distance;
        Scanner scan = new Scanner(System.in);
        try
        {
            System.out.println("Enter the number of vertices");
            number_of_vertices = scan.nextInt();
 
            adjacency_matrix = new int[number_of_vertices + 1][number_of_vertices + 1];
            System.out.println("Enter the Weighted Matrix for the graph");
            for (int i = 1; i <= number_of_vertices; i++)
            {
                for (int j = 1; j <= number_of_vertices; j++)
                {
                    adjacency_matrix[i][j] = scan.nextInt();
                    if (i == j)
                    {
                        adjacency_matrix[i][j] = 0;
                        continue;
                    }
                    if (adjacency_matrix[i][j] == 0)
                    {
                        adjacency_matrix[i][j] = MAX_VALUE;
                    }
                }
            }
 
            System.out.println("Enter the source ");
            source = scan.nextInt();
 
            System.out.println("Enter the destination");
            destination = scan.nextInt();
 
            UniformCostSearch uniformCostSearch = new UniformCostSearch(number_of_vertices);
            distance = uniformCostSearch.uniformCostSearch(adjacency_matrix,source, destination);
            uniformCostSearch.printPath();
 
            System.out.println("\nThe Distance between source " + source +
                          " and destination " + destination + " is " + distance);
 
        } catch (InputMismatchException inputMismatch)
        {
            System.out.println("Wrong Input Format");
        }
        scan.close();
    }
}
