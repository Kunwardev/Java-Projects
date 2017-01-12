package graohics;

import java.awt.event.*;
import java.awt.*;

public class ballassignment1 extends Frame implements ActionListener
{

    int x = 20;
    int y = 50;
    Button bt1,bt2,bt3,bt4;
    Color cl = Color.BLUE;
    boolean flag = true;

    ballassignment1() {
        bt1 = new Button("Start");
        bt2 = new Button("Stop");
        bt3 = new Button("Red");
        bt4 = new Button("Blue");
        bt1.setBounds(20,460,100,30);
        bt2.setBounds(130,460,100,30);
        bt3.setBounds(240,460,100,30);
        bt4.setBounds(350,460,100,30);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
    }

    public static void main(String[] args) {
        ballassignment1 obj = new ballassignment1();
    }

    public void paint(Graphics g) {
        g.drawRect(20, 50, 400, 400);
        g.setColor(cl);
        g.fillOval(x, y, 50, 50);
    }
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==bt1)
        {
            flag = true;
            Job obj1 = new Job();
            Thread t = new Thread(obj1);
            t.start();
        }
        if(e.getSource()==bt2)
        {
            flag = false;
        }
        if(e.getSource()==bt3)
        {
            cl = Color.RED;
            repaint();
        }
        if(e.getSource()==bt4)
        {
            cl = Color.BLUE;
            repaint();
        }
    }

    public class Job implements Runnable {

        public void run() {
            try {
                while (flag==true) {
                    if (y == 50) {
                        Thread.sleep(5);
                        x++;
                        repaint();
                    }
                    if (x == 370) {
                        Thread.sleep(5);
                        y++;
                        repaint();
                    }
                    if (y == 400) {
                        Thread.sleep(5);
                        x--;
                        repaint();
                    }
                    if (x == 20) {
                        Thread.sleep(5);
                        y--;
                        repaint();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
