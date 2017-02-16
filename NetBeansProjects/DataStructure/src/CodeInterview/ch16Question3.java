/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;

import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author Kunwar
 */
public class ch16Question3
{
    static class Line{
        float slope,yintercept;
        Point start,end;
        
        Line(Point start,Point end){
            this.start = start;
            this.end = end;
            slope = (end.y - start.y)/(end.x - start.x);
            yintercept = end.y - slope * end.x;
        }
    }
    
    private static boolean isBetween(Point start1, Point mid, Point end1){
        return ((start1.x <= mid.x && end1.x >= mid.x) && (start1.y <= mid.y && end1.y >= mid.y));
    }
    
    private static Point Intersection(Line line1, Line line2){
        if(line1.slope == line2.slope){
            if(line1.yintercept == line2.yintercept && (isBetween(line1.start, line2.start, line1.end))){
                return line2.start;
            }else 
                return null;
        }
        int x =(int) ((int) (line2.yintercept - line1.yintercept)/(line1.slope - line2.slope));
        int y =(int) ((int) (x * line1.slope) + line1.yintercept);
        Point Intersection = new Point(x, y);
        if((isBetween(line1.start, Intersection, line1.end))&&(isBetween(line2.start, Intersection, line2.end))){
            return Intersection;
        }
        return null;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Point start1 = new Point(x, y);
        x = sc.nextInt();y = sc.nextInt();
        Point end1 = new Point(x, y);
        x = sc.nextInt();y = sc.nextInt();
        Point start2 = new Point(x, y);
        x = sc.nextInt();y = sc.nextInt();
        Point end2 = new Point(x, y);
        Line line1 = new Line(start1, end1);
        Line line2 = new Line(start2, end2);
        Point  p = Intersection(line1, line2);
        if(p == null)
            System.out.println("No point of Intersection");
        else
            System.out.println(p.x+" "+p.y);
    }
    
}
