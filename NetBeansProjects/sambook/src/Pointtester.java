import java.awt.*;

public class Pointtester
{
    public static void main(String[] args)
    {
        int x,y,z,t;
        x=10;
        y = 5;
        z = -12;
        t = -1;
        Point4d a = new Point4d(x,y,z,t);
        a.disp(x,y,z,t);
        x = 9;y = 1;z = 3;t=5;
        a.move(a.x,a.y,a.z,a.t);
        System.out.println(a.x);
        a.translate(1,1,1,1);
        a.disp(a.x, a.y, a.z, a.t);
    }
    
}
