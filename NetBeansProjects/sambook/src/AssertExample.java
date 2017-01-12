/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */
public class AssertExample {
    public static void main(String[] args) {
        // get a number in the first argument
        int number = Integer.parseInt(args[0]);
 
        assert number <= 10:"Number not valid"; // stops if number > 10
 
        System.out.println("Pass");
 
    }
}