package graohics;

import java.awt.*;
import java.awt.event.*;

public class threads extends Frame implements ActionListener
{
    Button bt1;
    threads()
    {
        bt1 = new Button("Click");
        bt1.setBounds(20,50,60,50);
        setLayout(null);
        setVisible(true);
        setSize(400,400);
        add(bt1);
        bt1.addActionListener(this);
    }
   

    public static void main(String[] args) {
        threads a = new threads();
        }
   
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt1)
        {
            Thread t1 = new Thread(new job());
            t1.start();
        }
    }
    
}
