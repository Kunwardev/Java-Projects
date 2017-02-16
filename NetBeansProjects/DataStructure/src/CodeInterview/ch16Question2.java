/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;

/**
 *
 * @author Kunwar
 */
public class ch16Question2
{
    private static int count(String line[], String word){
        word = word.trim().toLowerCase();
        int count = 0;
        for(String check: line){
            if(check.trim().toLowerCase().equals(word)){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        String[] line = new String[]{"kun","war","dev","sin","gh ","rat","tan"," war "};
        String word = "war";
        System.out.println(count(line, word));
    }
    
}
