package Learn;
import geometry.*;
/**
 *
 * @author Kunwar
 */
public class jartest
{
    public static void main(String[] args)
    {
        Shape orange = new Circle("circle");
        double area = orange.calculateArea();
        System.out.println("Area is "+area);
    }
}
