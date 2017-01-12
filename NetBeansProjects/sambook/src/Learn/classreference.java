package Learn;

import java.awt.Point;

public class classreference
{
    public static void main(String[] args)
    {
        Point pt1 = new Point(100, 200)
        ;Point pt2 = new Point();
        pt1 = pt2;
        pt1.x = 200;
        pt1.y = 200;
        System.out.println("PT1: "+pt1.x+" "+pt1.y);
        System.out.println("PT2: "+pt2.x+" "+pt2.y); /* pt2 was also changed. 
        When you assign the value of pt1 to pt2, you actually
create a reference from p2 to the same object to which pt1 refers. Change the object that
pt2 refers to, and you also change the object that pt1 points to, because both are references
to the same object. */
    }
}
