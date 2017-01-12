import java.util.Random;
import java.io.*;
public class SandL 
{   static boolean flag = false;
    Random dice1 = new Random();
    Random dice2 = new Random();
    
    String P1  ;
    String P2  ;
    
    int Num2;
    public static void main(String[] args)throws IOException 
    {
        String name1,name2;
         Gamept1 S1 = new Gamept1();
        gamept2 S2 = new gamept2();
        SandL G1 = new SandL();
        name1= S1.name();
        name2 = S2.name();
  
  //      System.out.println(name1 + name2);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Thread T1 = new Thread((Runnable)new Gamept1());
        T1.start();
        if(flag==true)
        {Thread T2 = new Thread((Runnable) new gamept2());
        T2.start();
        }
    }
}