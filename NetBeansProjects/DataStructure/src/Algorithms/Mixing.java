package Algorithms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */
public class Mixing {
    
        
    public static String mix(String s1, String s2) {
      // your code
      int strings1[] = new int[26];
      int strings2[] = new int[26];
      String results[] = new String[26];
      for(int p=0;p<26;p++)
      {
        strings1[p] = 0;
        strings2[p] = 0;
      }
      for(int i=0;i<s1.length();i++)
        {
          if(s1.charAt(i) >=97 && s1.charAt(i) <=122)
          strings1[s1.charAt(i)-'a']++;
        }
      for(int j=0;j<s2.length();j++)
        {
        if(s2.charAt(j)>=97 && s2.charAt(j) <= 122)
        strings2[s2.charAt(j) - 'a']++;
        }
      
      String result = "";
      for(int o=0;o<26;o++)
      {
        if(strings1[o] > strings2[o])
        {
            //System.out.println(o);
          result+="1:";
          for(int i=0;i<strings1[o];i++)
            result+=(char)(o+'a');
          results[o] = result;
          result = "";
        }
        else if(strings2[o] > strings1[o])
        {
            //System.out.println(o);
          result+="2:";
          for(int i=0;i<strings2[o];i++)
          {
              result+=(char)(o+'a');
          }
          results[o] = result;
          result = "";
        }
        else if(strings2[o] == strings1[o] && strings1[o] != 0 )
         {
          result +="=:";
          if(s1.length() > s2.length())
          for(int i=0;i<strings1[o];i++)
            result+=(char)(o+'a');
          else
          for(int i=0;i<strings2[o];i++)
            result+=(char)(o+'a');
          results[o] = result;
          result = "";
        }
        else
            results[o] = "1";
      }
      for(int i=0;i<26;i++)
      {
          for(int j=0;j<25-i;j++)
          {
              if(results[j].length() < results[j+1].length())
              {
                  String temp = results[j];
                  results[j] = results[j+1];
                  results[j+1] = temp;
              }
              else if(results[j].length() == results[j+1].length() && results[j].length() > 2)
              {
                  if(results[j].charAt(0) > results[j+1].charAt(0)  )
                  {
                      String temmp = results[j];
                      results[j] = results[j+1];
                      results[j+1] = temmp;
                  }
              }
          }
      }
      result = "";
      for(int i=0;i<26;i++)
      {
          if(results[i].length() <= 3)
              break;
          else
          {
              result+=results[i]+"/";
          }
      }
      if(result != "")
        result = result.substring(0,result.length()-1);
      return result;
    }    
   
    public static void main(String[] args)
    {
        String x1 = "codewars";
        String x2 = "codewars";
        String a = mix(x1, x2);
        System.out.println(a);
    }
}    
