/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

/**
 *
 * @author Kunwar
 */
public class Diamond
{  public static String print(int n) {
    // TODO your code here
    
  	String result = "";
    if(n<0 || n%2 == 0)
    	return null;
    for(int i=0;i<n/2;i++)
    {
    	for(int j=i;j<n/2;j++)
      	result+=" ";
      for(int j=0;j<2*i+1;j++)
      	result+="*";
      result+="\n";
    }
    for(int i=0;i<n;i++)
    	result+="*";
      result+="\n";
    int star = n-2;
    for(int i=0;i<n/2;i++)
    {
    	for(int j=0;j<i+1;j++)
      	result+=" ";
      for(int k=0;k<star;k++)
      	result+="*";
        result+="\n";
       star -=2;
    }
    return result;
  }
}
