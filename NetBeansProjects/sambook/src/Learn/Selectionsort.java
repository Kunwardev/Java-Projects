package Learn;

import java.util.Scanner;

public class Selectionsort
{
    public static void main(String[] args)
    {
        int num[] = new int[5];
        Scanner a = new Scanner(System.in);
        for(int i= 0 ;i<5;i++)
        {
            num[i] = a.nextInt();
        }
        
        for(int i =0;i<4;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(num[i]>num[j])
                {
                    int z;
                    z = num[i];
                    num[i] = num[j];
                    num[j] = z;
                }
            }
        }
        
        for(int i=0;i<5;i++)
        {
            System.out.println(i+1+" --> " + num[i]);
        }
    }
}