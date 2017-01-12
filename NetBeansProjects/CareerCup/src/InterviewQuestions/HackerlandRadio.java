/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Kunwar
 */
public class HackerlandRadio
{   
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int x_i=0; x_i < n; x_i++){
            set.add(in.nextInt());
        }
        int count = 0;
        int reference = set.first();
        //System.out.println(set);
        while(true){
            if((set.last()-reference) <= k){
                count++;
                break;
            }
            reference = set.floor(reference + k);
            count++;
            //System.out.println("a"+reference);
            if(set.higher(reference + k) != null){
                reference = set.higher(reference + k);
            }else{
                break;
            }
            //System.out.println("b"+reference);
        }
        System.out.println(count);
    }
}