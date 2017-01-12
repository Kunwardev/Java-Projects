package Test;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
public class NewCalci extends JFrame implements ActionListener
{ 
    JButton bt1;
    NewCalci()
    {
        bt1 = new JButton("Click");
        setSize(500,500);
        setVisible(true);
        setLayout(null);
        add(bt1);
        bt1.setBounds(20,50,100,30);
        bt1.setBackground(Color.red);
        bt1.setForeground(Color.BLACK);
        bt1.addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bt1)
        {
            System.out.println("Successful");
        }
    }
public static void main(String ar[])
{
    NewCalci n = new NewCalci();
}
}
