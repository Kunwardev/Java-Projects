
package Class;

import java.awt.Color;
import javax.swing.*;

public class SwingDemo
{
    SwingDemo()
    {
        JFrame frm = new JFrame("NEW Swing Demo");
        frm.setSize(500,500);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jl = new JLabel("Swing Label");
        jl.setBounds(20,50,100,30);
        jl.setBackground(Color.red);
        jl.setForeground(Color.red);
        frm.add(jl);
        frm.setLayout(null);
        frm.setVisible(true);
    }
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
   public void run()
            {
                new SwingDemo();
            }
        });
    }
}
