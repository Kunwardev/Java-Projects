package Calci;

import java.awt.Font;
import java.awt.event.*;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class Calculatorfinal extends JFrame implements ActionListener
{
    int value; //0->+ 1->- 2->* 3->/ 4->%
    static double first, second;
    double Ans ;
    String Screen="";
    boolean start = true, stop = false;
    JTextField jtextfield;
    JButton bt[][];
    JButton bt1[];

    public Calculatorfinal()
    {

        setSize(480, 400);
        setVisible(true);
        setLayout(null);

        JTextField jtextfield = new JTextField(10);
        Font font1 = new Font("Serif", Font.PLAIN, 15);
        Font font2 = new Font("Serif", Font.BOLD, 20);
        JButton bt[][] = new JButton[6][5];
        JButton bt1[] = new JButton[5];

        jtextfield.setFont(font2);
        jtextfield.setBounds(10, 40, 420, 50);
        jtextfield.setEditable(stop);
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                bt[i][j] = new JButton("");
                bt[i][j].setBounds(70 + 60 * i, 110 + 40 * j, 60, 40);
                bt[i][j].setFont(font1);
                add(bt[i][j]);
            }
        }
        
        for (int i = 0; i < 5; i++)
        {
            bt1[i] = new JButton();
            bt1[i].setBounds(10, 110 + 40 * i, 60, 40);
            bt1[i].setFont(font1);
            add(bt1[i]);
        }
        bt1[0].setText("Deg");
        bt1[0].setEnabled(stop);
        bt1[1].setText("Inv");
        bt1[2].setText("\u03C0");
        bt1[3].setText("e");
        bt1[4].setText("Ans");
        bt[0][0].setText("Rad");
        bt[0][1].setText("Sin");
        bt[0][2].setText("Cos");
        bt[0][3].setText("Tan");
        bt[0][4].setText("x10^");
        bt[1][0].setText("x!");
        bt[1][1].setText("ln");
        bt[1][2].setText("log");
        bt[1][3].setText("\u221A");
        bt[1][4].setText("x^y");
        bt[2][0].setText(" ");
        bt[2][1].setText("7");
        bt[2][2].setText("4");
        bt[2][3].setText("1");
        bt[2][4].setText("0");
        bt[3][1].setText("8");
        bt[3][2].setText("5");
        bt[3][3].setText("2");
        bt[3][4].setText(".");
        bt[4][0].setText("%");
        bt[4][1].setText("9");
        bt[4][2].setText("6");
        bt[4][3].setText("3");
        bt[4][4].setText("=");
        bt[5][0].setText("AC");
        bt[5][1].setText("\u00F7");
        bt[5][2].setText("x");
        bt[5][3].setText("-");
        bt[5][4].setText("+");
        add(jtextfield);
        double b;
        bt1[4].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == bt1[4])
                {
                    jtextfield.setText(Ans+"");
                }
            }
        });
        bt[2][4].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (e.getSource() == bt[2][4])
                {
                    Screen += "0";
                    jtextfield.setText(Screen);
                }
            }
        });
        bt[2][3].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (e.getSource() == bt[2][3])
                {
                    Screen += "1";
                    jtextfield.setText(Screen);
                }
            }
        });
        bt[2][2].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (e.getSource() == bt[2][2])
                {
                    Screen += "4";
                    jtextfield.setText(Screen);
                }
            }
        });
        bt[2][1].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (e.getSource() == bt[2][1])
                {
                    Screen += "7";
                    jtextfield.setText(Screen);
                }
            }
        });
        bt[3][1].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (e.getSource() == bt[3][1])
                {
                    Screen += "8";
                    jtextfield.setText(Screen);
                }
            }
        });
        bt[3][2].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (e.getSource() == bt[3][2])
                {
                    Screen += "5";
                    jtextfield.setText(Screen);
                }
            }
        });
        bt[3][3].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (e.getSource() == bt[3][3])
                {
                    Screen += "2";
                    jtextfield.setText(Screen);
                }
            }
        });
        bt[3][4].addActionListener(new ActionListener()
        {
         public void actionPerformed(ActionEvent e)
            {
                Screen +=".";
                jtextfield.setText(Screen);
            }
        });
        bt[4][3].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (e.getSource() == bt[4][3])
                {
                    Screen += "3";
                    jtextfield.setText(Screen);
                }
            }
        });
        bt[4][2].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (e.getSource() == bt[4][2])
                {
                    Screen += "6";
                    jtextfield.setText(Screen);
                }
            }
        });
        bt[4][1].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (e.getSource() == bt[4][1])
                {
                    Screen += "9";
                    jtextfield.setText(Screen);
                }
            }
        });
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
        bt1[2].addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                jtextfield.setText((Math.PI) + "");
            }
        });
        bt1[3].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                jtextfield.setText(Math.E + "");
            }
        });
        bt[0][0].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                bt1[0].setEnabled(start);
                bt[0][0].setEnabled(stop);
            }
        });
        bt1[0].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                bt[0][0].setEnabled(start);
                bt1[0].setEnabled(stop);
            }
        });
        bt[1][1].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                first = Math.log(Double.parseDouble(jtextfield.getText()));
                Screen = "";
                jtextfield.setText(first+"");
                Ans = first;
            }
        });
        bt[1][0].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                first = factorial(Double.parseDouble(jtextfield.getText()));
                jtextfield.setText(first+"");
                Screen ="";
                Ans = first;
            }
        });
        bt[5][0].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                jtextfield.setText("");
                Screen = "";
                first = 0;
                second = 0;
                Ans = 0;
            }
        });

        bt[1][2].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Screen = "";
                first = Double.parseDouble(jtextfield.getText());
                first = Math.log10(first);
                jtextfield.setText(first + "");
                Ans = first;
            }
        });
        bt[1][4].addActionListener(new ActionListener()     // value = 5
        {
         public void actionPerformed(ActionEvent e)
            {
                if(first==0)
                {
                    first = Double.parseDouble(jtextfield.getText());
                    Screen = "";
                    jtextfield.setText("");
                }
                else
                {
                    second = Double.parseDouble(jtextfield.getText());
                    Screen = "";
                    jtextfield.setText(Screen);
                    Ans = Math.pow(first, second);
                    jtextfield.setText(Ans+"");
                }
            }
        });
        bt[5][4].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                value = 0;
                if(first == 0)
                {
                    first = Double.parseDouble(jtextfield.getText());
                    Screen = "";
                    jtextfield.setText(Screen);
                }
                else
                {
                    second = Double.parseDouble(jtextfield.getText());
                    Screen = "";
                    jtextfield.setText(Screen);
                    Ans = first+second;
                    jtextfield.setText(Ans+"");
                }
            }
        });
        
        bt1[4].addActionListener(new ActionListener()
        {
         public void actionPerformed(ActionEvent e)
            {
                Screen = "";
                Ans = first;
                jtextfield.setText(Screen);
                jtextfield.setText(Ans+"");
            }
        });
        
        bt[5][3].addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e)
            {
                value = 1;
                if(first == 0)
                {
                    Screen = "";
                    first = Double.parseDouble(jtextfield.getText());
                    jtextfield.setText(Screen);
                    
                }
                else
                {
                    Screen = "";
                    jtextfield.setText(Screen);
                    second = Double.parseDouble(jtextfield.getText());
                    Ans = first - second;
                    jtextfield.setText(Ans+"");
                }
            }
        });
    }
       
    public static void main(String[] args)
    {
        Calculatorfinal c = new Calculatorfinal();
    }
    
    public double factorial(double a)
    {
        double x = 1;
        if (a == 0)
        {
            return 1;
        } else
        {
            for (double i = a; i >= 1; i--)
            {
                x = x * i;
            }
        }
        return x;
    }
    
    
    public void actionPerformed(ActionEvent e)
    {
    }

}				

    
