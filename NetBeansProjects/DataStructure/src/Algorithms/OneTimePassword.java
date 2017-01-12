package Algorithms;

import java.util.Random;

public class OneTimePassword
{
    public static void main(String[] args)
    {
        Random r = new Random();
        String Text = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String otp = "";
        for(int i=0;i<6;i++)
        {
            otp+=Text.charAt(r.nextInt(62));
        }
        System.out.println("The OTP is "+otp);
    }
}
