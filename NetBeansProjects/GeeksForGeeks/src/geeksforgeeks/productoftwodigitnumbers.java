/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geeksforgeeks;

import java.util.Scanner;

/**
 *
 * @author Kunwar
 */

class productoftwodigitnumbers {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T;
                double number;
		T = sc.nextInt();
		for(int i=0;i<T;i++)
		{
		    number = sc.nextDouble();
		    int x = String.valueOf(number).length();
		    int divide = x/2;
		    int num1 = (int)(number/Math.pow(10,divide-1));
		    int num2 = (int)(number%Math.pow(10,divide-1));
		    double result = (num1*num2);
		    System.out.println(num1+" "+num2+" " +result);
		}
	}
}