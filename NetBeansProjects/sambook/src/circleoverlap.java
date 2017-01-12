
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */
public class circleoverlap
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the co-ordinates of the Circle 1: ");
        int x1 = s.nextInt();int y1 = s.nextInt();
        System.out.println("Enter the radius of the Circle 1: ");
        int r1 = s.nextInt();
        System.out.println("");
        System.out.println("Enter the co-ordinates of the Circle 2: ");
        int x2 = s.nextInt();int y2 = s.nextInt();
        System.out.println("Enter the Radius of the Circle 2: ");
        int r2 = s.nextInt();
        double z = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        if(z>Math.abs(r2-r1))
            System.out.println("The Circle lies inside");
        else if(z<=r1+r2)
            System.out.println("The Circle intersects");
    }
}
