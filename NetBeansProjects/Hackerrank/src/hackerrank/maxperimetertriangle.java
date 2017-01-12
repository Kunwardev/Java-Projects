/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerrank;
import java.util.Scanner;
import java.util.Arrays;
        
/**
 *
 * @author Kunwar
 */
public class maxperimetertriangle {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int maxPerimeter = 0,resA = 0,resB=0,resC=0;
        for(int j=0;j<N-2;j++)
            {
            int a = arr[j],b=arr[j+1],c=arr[j+2];
            if(a+b>c&&a+c>b&&b+c>a)
            {
                int perimeter = a+b+c;
                if(perimeter > maxPerimeter)
                {
                    maxPerimeter = perimeter;
                    resA = a;
                    resB = b;
                    resC = c;
                }
            }
        }
        if(resA ==0 && resB ==0 && resC ==0)
            System.out.print(-1);
        else
            System.out.print(resA+" "+resB+" "+resC+" "+maxPerimeter);
         
    }
}