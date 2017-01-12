/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

/**
 *
 * @author Kunwar
 */
public class TimerRandomSelection
{
    public static void main(String[] args)
    {
        Timer t = new Timer();
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        int p = r.nextInt(10);
        int x = -1;
        long start = System.currentTimeMillis();
        while(x!=p){
            System.out.println("Type the Number: ");
            x = in.nextInt();
        }
        long stop = System.currentTimeMillis();
        System.out.println((double)(stop-start)/1000);
        ;
        System.out.println("Success: "+x);
    }
}
