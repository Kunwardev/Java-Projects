/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */
public class ColorFactory extends Abstractor {
    public Shape getShape(String shapeType)
    {return null;}
    Color getColor(String color)
    {if(color == null)
    {return null;}
    if(color.equalsIgnoreCase("RED")){return new Red();}
    return null;
    }
}