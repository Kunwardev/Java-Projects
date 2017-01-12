package Class;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
<applet code= "Checkbox" width = 100 height = 110>
</applet>
*/
public class Checkbox extends JApplet implements ItemListener
{
    JLabel lb;
    JCheckBox jb1;
    public void init()
    {
        try{
            SwingUtilities.invokeAndWait(new Runnable()
            {
                public void run()
                {
                    makeGUI();
                }
            });
        }catch(Exception w){}
    }
    private void makeGUI()
    {
        setLayout(new FlowLayout());
        jb1 = new JCheckBox("C");
        jb1.addItemListener(this);
        add(jb1);
        jb1 = new JCheckBox("C++");
        jb1.addItemListener(this);
        add(jb1);
        jb1 = new JCheckBox("Java");
        jb1.addItemListener(this);
        add(jb1);
            JLabel jl = new JLabel("Select Lang");
        add(jl);
    
    }

    public void itemStateChanged(ItemEvent e)
    {
        JCheckBox cb = (JCheckBox)e.getItem();
        if(cb.isSelected())
        {
            lb.setText("You Selected "+cb.getText());
        }
        else
        {
            lb.setText(cb.getText()+": Not Selected");
        }
    }
    
}
