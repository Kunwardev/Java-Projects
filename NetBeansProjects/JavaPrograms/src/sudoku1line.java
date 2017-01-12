import java.util.Random;
import java.util.Scanner;
public class sudoku1line
{
    public static void main(String[] args)
    {
    int a[] = new int[5];
    int i;
    Random num = new Random();
    int x = num.nextInt(3);
    a[0] = x+1;
    a[1] = x+2;
    Scanner s = new Scanner(System.in);
    for(i=2;i<5;i++)
    {
        a[i] = s.nextInt();
    }
    for(i=0;i<5;i++)
    {for (int j = i+1; j < 5; j++)
    {
        if(a[i]==a[j])
        {
            System.out.println("Words match at "+i+" and "+j);
        }
    }
    }
    for(i=0;i<5;i++)
    {
        System.out.println(a[i]);
    }
}
}