/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Kunwar
 */
public class kNearestPoint
{
    private static double distance(Point p){
        return ((p.x*p.x)+(p.y*p.y));
    }
    
    private static TreeMap<Double, ArrayList<Point>> arrange(Point[] p){
        ArrayList<Point> al = new ArrayList<>();
        TreeMap<Double, ArrayList<Point>> hm = new TreeMap<>();
        for(int i=0;i<p.length;i++){
            double dist = distance(p[i]);
            if(hm.containsKey(dist)){
                al = hm.get(dist);
                al.add(p[i]);
                hm.put(dist, al);
            }else{
                al = new ArrayList<>();
                al.add(p[i]);
                hm.put(dist, al);
            }
        }
        return hm;
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many Points to add?\n>>");
        int n = in.nextInt();
        Point[] p = new Point[n];
        System.out.println(">>Type the Points: ");
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(">>");
            p[i] = new Point(in.nextInt(), in.nextInt());
        }
        int k = in.nextInt();
        TreeMap<Double, ArrayList<Point>> hm = arrange(p);
        Set set = hm.entrySet();
        Iterator it = set.iterator();
        System.out.println("The Points are: ");
        while(it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();
            ArrayList<Point> r = (ArrayList<Point>)me.getValue();
            if(k<=r.size()){
                for(int i=0;i<k;i++)
                    System.out.println("( "+r.get(i).x+" , "+r.get(i).y+" )");
                break;
            }else{
                for(int i=0;i<r.size();i++){
                    System.out.println("( "+r.get(i).x+" , "+r.get(i).y+" )");
                }
                k = k - r.size();
            }
        }
    }
    
}
