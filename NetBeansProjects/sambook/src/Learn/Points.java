
package Learn;

import java.awt.Point;
import java.awt.geom.Point2D;
import javafx.scene.shape.Circle;

public class Points
{
    public static void main(String[] args)
    {
        Point newPoint = new Point(10, 10);
        System.out.println("value of x and y are: "+newPoint.x+"  "+newPoint.y);
        System.out.println("Changing the values of x and y");
        newPoint.x = 15;
        newPoint.y = 12;
        System.out.println("New VAlues are: "+newPoint.x+"  "+newPoint.y);
    }
}
