
import java.io.*;
import java.io.IOException;
import static statics.b;
import static statics.b;
public class test1
{
    public static void main(String[] args)throws IOException {
        System.out.println("Type the numbers : ");
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b[] = new int[a];
        System.out.println("Enter the numbers");
        for(int i=0;i<a;i++)
        {
            b[i] = Integer.parseInt(br.readLine());
            if(b[i]==0)
                count++;
        }
        int c = a-count;
        arrange(b[],c,a);
    }
    public void arrange(int b[],int c,int a)
    {
        int temp;
        while(c<a)
        {
        if(b[c]==0)
            c=c+1;
        else
        {
            for(int i=0;i<c;i++)
            {
                if(b[i]==0)
                {
                    temp = b[i];
                    b[i]=b[c];
                    b[c]=temp;
                    c = c+1;
                }
                break;
            }
        }
        }
}
}
