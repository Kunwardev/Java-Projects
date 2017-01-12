/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args)
{//get shape factory
    Abstractor shapeFactory = Producer.getFactory("SHAPE");
//get an object of ShapeCircle
    //get an object of Shape RectangleShape 
    Shape shape1 = shapeFactory.getShape("RECTANGLE");
//call draw method of Shape Rectangle
    shape1.draw();
//get color factory
    Abstractor colorFactory = Producer.getFactory("COLOR");
//get an object of Color Red
    Color color1 = colorFactory.getColor("RED");
//call fill method of Red
    color1.fill();
}
}