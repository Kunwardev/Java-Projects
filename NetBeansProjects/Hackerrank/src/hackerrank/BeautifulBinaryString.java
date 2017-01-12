/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerrank;

/**
 *
 * @author Kunwar
 */
public class BeautifulBinaryString
{
    public static void main(String[] args)
    {
        String B = "0101010";
        System.out.println((B.length()-B.replaceAll("010", "").length())/3);
    }
}
