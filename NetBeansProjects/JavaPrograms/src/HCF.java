import java.io.*;
public class HCF {public static void main(String[] args)throws IOException
{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.println("Type two numbers for finding its H.C.F ");    
    int a = Integer.parseInt(br.readLine()); 
    int b = Integer.parseInt(br.readLine()); 
    int dd,dv;
    if(b>a)
    {
         dd = b;
         dv = a;
    }else
    {
        dd = a;
        dv = b;
    }
    while(true)
    {
        int r = dd%dv;
        if(r==0)
            break;
        dd = dv;
        dv =  r;
    }
    System.out.println("The H.C.F of two numbers is "+dv);
}
}
