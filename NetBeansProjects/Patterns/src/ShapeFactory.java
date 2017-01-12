/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */
public class ShapeFactory extends Abstractor
{
    
    public Shape getShape(String shapeType)
    {
        if(shapeType == null)
        {return null;}
        
        else if(shapeType.equalsIgnoreCase("RECTANGLE"))
        {return new Rectangle();}
        return null;
    }
        Color getColor(String color)
        {return null;}}