
package Class;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/*
<object code = "SwingApplet width = 100 height = 200">
</object>
*/

public class SwingApplet extends JApplet
{
    JButton jal,jbe;
    JLabel lb;
    public void init()
    {
        setBackground(Color.red);
        try{
            SwingUtilities.invokeAndWait(new Runnable()
            {
               public void run()
                {
                    makeGUI();
                }
            });
        }catch (Exception e){}
    }
    private void makeGUI()
    {
        setLayout( new FlowLayout());
        JLabel lb = new JLabel("No Pressed");
        JButton jal = new JButton("Alpha");
        JButton jbe = new JButton("Beta");
        jal.addActionListener(new ActionListener()
        {
   public void actionPerformed(ActionEvent e)
            {
                lb.setText("Alpha Pressed");
            }
        });
        jbe.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
            lb.setText("Beta Pressed");
        }
        });
        add(jal);
        add(jbe);
        add(lb);
    }
}
