package hackerrank;

import java.util.Scanner;

public class InsertionSortFinal
{
     public static int TripleDouble(long num1, long num2) 
  {
    //code me ^^
    char a, b, c = 0;
    boolean tru = false,tru1 = false;
    String c1 = Long.toString(num1);
    for(int i=2;i<c1.length();i++)
    {
       a = c1.charAt(i-2);
       b = c1.charAt(i-1);
       c = c1.charAt(i);
       if(a == b && b == c)
       {
           tru = true;
           break;
       }     
    }
    String c2 = Long.toString(num2);
    for(int i=1;i<c2.length();i++)
    {
      a = c2.charAt(i-1);
      b = c2.charAt(i);
      if(a == b && b == c)
      {
          tru1 = true;
          break;
      }
    }
    if(tru == true && tru1 == true)
      return 1;
return 0;
  }
}
/*    public static void main(String[] args)
    {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
            arr[i] = sc.nextInt();
        for(int i=1;i<5;i++)
        {
            int j=i-1;
            int key = arr[i];
            while(j>-1&&arr[j]>key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for(int i=0;i<5;i++)
            System.out.print(arr[i]+" ");
    }
}*/
