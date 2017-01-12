package Algorithms;

public class RomanConversion
{
    int Numerals;
    static String Roman = "";
    public static String Convert(int Nu)
    {
        while(Nu >= 1000)
        {
            Roman += "M";
            Nu-=1000;
        }
        while(Nu>=900)
        {
            Roman += "CM";
            Nu -=900;
        }
        while(Nu>=500)
        {
            Roman += "D";
            Nu -= 500;
        }
        while(Nu>=400)
        {
            Roman += "CD";
            Nu -= 400;
        }
        while(Nu>=100)
        {
            Roman += "C";
            Nu -= 100;
        }
        while(Nu>=90)
        {
            Roman += "XC";
            Nu -= 90;
        }
        while(Nu>=50)
        {
            Roman += "L";
            Nu -= 50;
        }
        while(Nu>=40)
        {
            Roman += "XL";
            Nu -= 40;
        }
        while(Nu>=10)
        {
            Roman += "X";
            Nu-=10;
        }
        while(Nu>=9)
        {
            Roman += "IX";
            Nu -= 9;
        }
        while(Nu>=5)
        {
            Roman += "V";
            Nu -= 5;
        }
        while(Nu>=4)
        {
            Roman += "IV";
            Nu -= 4;
        }
        while(Nu>=1)
        {
            Roman += "I";
            Nu -= 1;
        }
        return Roman;
    }
    public static void main(String[] args)
    {
        String answer = Convert(1666);
        System.out.println(answer);
    }
}
