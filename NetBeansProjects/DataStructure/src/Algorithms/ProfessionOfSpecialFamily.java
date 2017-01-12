package Algorithms;

public class ProfessionOfSpecialFamily
{
    
    public static char Pos(int level, int pos)
        {
            int c = Integer.bitCount(pos-1);
            return (c%2 == 1) ? 'd' : 'e';
        }
    
    public static void main(String[] args)
    {
        char a = Pos(4,4);
        if(a == 'd')
            System.out.println("Doctor");
        else
            System.out.println("Engineer");
    }
}
