import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class Main_1

{
	public static void main (String[] args) throws java.lang.Exception,java.io.IOException
	{
		try{
		BigInteger b1,b2,b3;
                int T;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++)
		{
		        b1 = new BigInteger(br.readLine());
			b2 = new BigInteger(br.readLine());
			b3 = b1.multiply(b2);
			System.out.println(b3);
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
        
}