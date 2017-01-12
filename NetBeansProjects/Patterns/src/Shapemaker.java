/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */

public class Shapemaker
{
    private Shape rectangle;
    public Shapemaker(){
        rectangle = new Rectangle();
    }
    void drawrectangle(){
        rectangle.draw();
    }
}
