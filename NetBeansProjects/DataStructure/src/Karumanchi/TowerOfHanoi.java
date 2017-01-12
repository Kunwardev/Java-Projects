
package Karumanchi;

public class TowerOfHanoi
{
    public static void Hanoi(int disk,char source,char dest,char aux)
    {
        if(disk == 1)
            System.out.println("Move Disk 1 from "+source+" to "+dest);
        else
        {
            Hanoi(disk-1,source,aux,dest);
            System.out.println("Move Disk "+disk+" from "+source+" to "+dest);
            Hanoi(disk-1,aux,dest,source);
        }
    }
    public static void main(String[] args)
    {
        Hanoi(3,'A','B','C');
    }
}
