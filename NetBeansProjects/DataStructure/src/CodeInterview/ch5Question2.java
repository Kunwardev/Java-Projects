/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;

/**
 *
 * @author Kunwar
 */
public class ch5Question2
{
    public static String firstBinary(int decimal){
        String answer = "";
        if(decimal == 0)
            return "0";
        while(decimal != 0){
            int x = decimal % 2;
            decimal /= 2;
            answer =  x + answer;
        }
        return answer;
    }
    
    private static String secondBinary(String decimal){
        double answer = Double.parseDouble(decimal);
        String include = "";
        while(answer > 0){
            if(include.length() == 32){
                System.out.println("Not Full");
                break;
            }
            if(answer == 1){
                include += 1;
                return include;
            }else{
                answer = answer * 2;
                if(answer > 1){
                    include += 1;
                    answer = answer - 1;
                }else if (answer < 1){
                    include += 0;
                }
            }
        }
        return include;
    }
    
    private static String convert(String decimal){
        String answer = "";
        String split[] = decimal.split("\\.");
        int first = Integer.parseInt(split[0]);
        String second = "0."+split[1];
        answer = firstBinary(first);
        answer +="."+ secondBinary(second);
        return answer;
    }
    
    public static void main(String[] args)
    {
        String question = "0.40625";
        String answer = convert(question);
        System.out.println(answer);
    }
    
}
