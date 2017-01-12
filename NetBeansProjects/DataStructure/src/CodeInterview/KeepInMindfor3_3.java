package CodeInterview;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Kunwar
 */
public class KeepInMindfor3_3
{
    static String[] t1 = new String[2];
    static ArrayList<String[]> al = new ArrayList<String[]>();
    public static void main(String[] args)
    {
        t1[0] = "0";t1[1] = "0";al.add(t1);
        t1[0] = "0";t1[1] = "1";al.add(t1);
        t1[0] = "1";t1[1] = "0";al.add(t1);
        t1[0] = "1";t1[1] = "1";al.add(t1);
        for (String[] tt : al){
            System.out.print("[");
            for (String s : tt)
            System.out.print(s+" ");
            System.out.print("]");
        }
        System.out.println("");
        //The problem is that you are adding the same object to each index of your ArrayList.
        //Every time you modify it, you are modifying the same object.
        //To solve the problem, you have to pass references to different objects.
        t1[0] = "0";
        t1[1]="0";
        al.add(t1);
        t1 = new String[2];
        t1[0] = "0";
        t1[1]="1";
        al.add(t1);
        t1 = new String[2];
        t1[0] = "1";
        t1[1]="0";
        al.add(t1);
        t1 = new String[2];
        t1[0] = "1";
        t1[1]="1";
        al.add(t1);
        for (String[] tt : al){
            System.out.print("[");
            for (String s : tt)
            System.out.print(s+" ");
            System.out.print("]");
        }
    }
}
