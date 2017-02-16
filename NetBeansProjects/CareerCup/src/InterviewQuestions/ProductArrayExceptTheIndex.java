/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions;

import java.util.ArrayList;

/**
 *
 * @author Kunwar
 */
public class ProductArrayExceptTheIndex
{
    private static ArrayList<Integer> Function(ArrayList<Integer> al){
        ArrayList<Integer> answer = new ArrayList<>();
        int prod = 1;
        for(int i=0;i<al.size();i++){
            prod = prod * al.get(i);
        }
        for(int j=0;j<al.size();j++){
            answer.add(prod/al.get(j));
        }
        return answer;
    }
    
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        ArrayList<Integer> answer = Function(al);
        System.out.println(answer);
    }
    
}
