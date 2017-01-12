
package Class;

import javax.swing.*;
import java.awt.*;

public class Swingdemo2 extends JFrame
{
    JLabel jl;
    Swingdemo2()
    {
        super("Hello Working");
        JLabel jl = new JLabel("Swing LAbel");
        jl.setBounds(20,50,100,30);
        jl.setForeground(Color.red);
        add(jl);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        Swingdemo2  s= new Swingdemo2();
    }
}
