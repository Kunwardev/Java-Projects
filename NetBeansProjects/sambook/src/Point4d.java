import java.awt.*;

class Point3d extends Point
{
    public int z;
    Point3d(int x,int y,int z){
        super(x,y);
        this.z = z;
    }
   public void move(int x,int y,int z)
   {
       super.move(x,y);
       this.z = z;
   }
   public void translate(int x,int y,int z)
   {
       super.translate(x, y);
       this.z += z;
   }
}

public class Point4d extends Point3d 
{
    public int t;   
    public Point4d(int x,int y,int z,int t)
    {
        super(x, y, z);
        this.t = Math.abs(t);
    }
    public void move(int x,int y,int z,int t)
    {
        super.move(x,y,z);
        this.z = Math.abs(z);
    }
    public void translate(int x,int y,int z,int t)
    {
        super.translate(x, y,z);
        this.z +=Math.abs(z);
    }
    public void disp(int x,int y,int z,int t)
    {
        System.out.println("x: "+x+" y: "+y+" z: "+z+" t: "+Math.abs(t));
    }
}