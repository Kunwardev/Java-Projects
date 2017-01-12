package graohics;

import java.awt.*;
import java.awt.event.*;

public class balldemo extends Frame implements ActionListener
{
    Button bt1,bt2;
    balldemo()
    {
        bt1 = new Button("Start");
        bt2 = new Button("Stop");
        bt1.setBounds(20,80,50,40);
        bt2.setBounds(80,80,50,40);
        add(bt1);
        add(bt2);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        bt1.addActionListener(this);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        balldemo obj = new balldemo();
    }
    public void paint(Graphics g)
    {
        g.drawRect(70, 130,300,300);
        g.fillOval(70, 130, 20, 20);
        
        }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt1)
        {
        }
    }
    
}
