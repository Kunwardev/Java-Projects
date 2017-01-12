/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */
public class piusingmontecarlo
{
    public static void main(String[] args)
    {
        double PIVAL = PIvalue(1000000);
        System.out.println("Pi is "+PIVAL);
    }
    public static double PIvalue(int numPoints)
     {
         int inCount = 0;
         for(int i=0;i<numPoints;i++)
         {
             double randX = (Math.random()*2)-1;
             double randY = (Math.random()*2)-1;
             
             double dist = Math.sqrt(randX*randX+randY*randY);
             if(dist < 1)
             {
                 inCount++;
             }
         }
         return 4.0 * (numPoints/inCount );
     }
}
