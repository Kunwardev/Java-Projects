package graohics;

import java.awt.event.*;
import javax.swing.*;

public class subframes extends JFrame implements ActionListener
{    
    JButton bt1,bt2,bt3;
    subframes()
    {
        setVisible(true);
        setLayout(null);
        setSize(400,400);
        bt1 = new JButton("Calculator");
        bt2 = new JButton("Tic Tac Toe");
        bt3 = new JButton("Free Hand Drawing");
        bt1.setBounds(20,50,200,40);
        bt2.setBounds(20,100,200,40);
        bt3.setBounds(20,150,200,40);
        add(bt1);
        add(bt2);
        add(bt3);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
    }
    public static void main(String[] args) {
        subframes bj = new subframes();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt1)
        {
            Calculator obj = new Calculator();
        }
        else if(e.getSource()==bt2)
        {
             tictactoe obj = new tictactoe();
        }
        else
        {
            mousedrag obj = new mousedrag();
        }
    }
}
