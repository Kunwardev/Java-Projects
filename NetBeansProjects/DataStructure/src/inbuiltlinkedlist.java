/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author Kunwar
 */
public class inbuiltlinkedlist
{
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(x>=0)
        {
            ll.add(x);
            x = sc.nextInt();
        }
        ll.remove(1);
        System.out.println(ll);
    }
}
