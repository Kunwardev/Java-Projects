/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */
public class Generics
{
    private static < T > T Print(T a){
        return a;
    }
    
    public static void main(String[] args)
    {
        int x  = 10;
        String p = "Hello World";
        double y = 10.5;
        
        System.out.println(Print(x));
        System.out.println(Print(p));
        System.out.println(Print(y));
        
    }
    
}
