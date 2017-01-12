/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerrank;

import java.util.*;
import java.lang.*;
import java.math.*;

public class spojFCTRL
{
	public static int Zeroes(int number)
	{
            
		int count=0;
		if(number < 0)
			return -1;
		else if (number<5)
			return 0;
		else if (number==5)
			return 1;
                else{
                for(int j=5;number/j>=1;j*=5)
		{
			count+=number/j;
		}
                }
		return count;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i=0;i<x;i++)
		{
		int N = sc.nextInt();
		int result = Zeroes(N);
		System.out.println(result);
		}
	}
}