package Learn;

import java.awt.Point;

public class CloneCopy
{
    public static void main(String[] args)
    {
        Point pt1 = new Point(10,100);
        Point pt2 = new Point();
        Point pt3 = new Point(1,1);
        pt2 = (Point) pt1.clone();
        /* Copy method is not present */
    }
}
