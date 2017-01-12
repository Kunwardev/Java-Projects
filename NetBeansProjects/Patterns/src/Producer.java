/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */
public class Producer 
{public static Abstractor getFactory(String choice)
{if(choice.equalsIgnoreCase("SHAPE"))
{return new ShapeFactory();}
else if(choice.equalsIgnoreCase("COLOR"))
{
return new ColorFactory();}
return null;}
}