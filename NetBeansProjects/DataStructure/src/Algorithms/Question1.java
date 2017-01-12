/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kunwar
 */
public class Question1 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        ArrayList<Long> array = readNumbersArrayFromFile();
  
        //SORT THE ARRAY
        Collections.sort(array);
        
        //WE DO USING ARRAYS INSTEAD OF NATIVE JAVA HASHMAP IN ORDER TO SPEED UP THE COMPUTATION
        int counter = 0;
        
        for(int sum = -10000; sum <= 10000; sum++)
        {
            int start = 0;
            int end = array.size() - 1;
	
            boolean found = false;
	
            while(!found && start < end) 
            {
		if(array.get(start) + array.get(end) == sum)
                {
                    if(array.get(start).longValue() != array.get(end).longValue()){
                        found = true;
                    }
                }
		else if(array.get(start) + array.get(end) > sum){
                    end--;
                }
		else if(array.get(start) + array.get(end) < sum){
                    start++;
                }
            }
	
            if(found){
                counter++;
            }
        }
        
        System.out.println("*** COUNTER => " + counter + " ***");
    }
    
    
    /**
     * Reads the Long array to be used as input for the assignment
     * @return A Long array 
     */
    private static ArrayList<Long> readNumbersArrayFromFile() throws IOException
    {
        ArrayList<Long> longArray = new ArrayList<Long>();
            
        FileInputStream fstream = null;
        try 
        {
            fstream = new FileInputStream("C:\\Users\\Kunwar\\Desktop\\WDM\\Sum.txt");
            
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            
            String line;
            while ((line = br.readLine()) != null){
                longArray.add(Long.valueOf(line));
            }
            
            br.close();
        }catch (FileNotFoundException ex) {
            Logger.getLogger(Question1.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(Question1.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            try {
                fstream.close();
            } catch (IOException ex) {
                Logger.getLogger(Question1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return longArray;
    }
}