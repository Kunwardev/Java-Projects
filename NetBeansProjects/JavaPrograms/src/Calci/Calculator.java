package Calci;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener
{

    Container c;
    JTextField result;
    JPanel p = new JPanel();
    JButton b[] = new JButton[18];
    JButton bt[] = new JButton[9];
    String s[] =
    {
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "/"
      , "*","%", "=", "C","!"
    };
    //------------------------------------------------
    String Screen = "", monitor1 = "", monitor2 = "", OperationOnScreen = "";
    boolean CommandEmpty = true, switcher = true;
    double R = Integer.MIN_VALUE, L = Integer.MIN_VALUE;

    //------------------------------------------------

    public Calculator()
    {
        super("Casio ^_^");

        c = getContentPane();
        result = new JTextField();
        result.setBounds(0,0,150, 50);
        result.setEditable(false);
        p.setLayout(null);
        for (int i = 0; i <=17; i++)
        {
            b[i] = new JButton(s[i]);
            b[i].addActionListener(this);
            p.add(b[i]);
        }
        bt[0] = new JButton("1/x");
        bt[1] = new JButton("ln");
        bt[2] = new JButton("log");
        bt[3] = new JButton("Sin");
        bt[4] = new JButton("Cos");
        bt[5] = new JButton("Tan");
        bt[6] = new JButton("-");
        bt[7] = new JButton("\u03C0");
        bt[8] = new JButton("x^2");
        bt[8] = new JButton("x^2");
        bt[1].setBounds(90,250,50,50);
        bt[0].setBounds(140,250,50,50);
        bt[2].setBounds(40,250,50,50);
        bt[3].setBounds(40,200,50,50);
        bt[4].setBounds(40,150,50,50);
        bt[5].setBounds(40,100,50,50);
        bt[6].setBounds(100,100,50,50);
        bt[7].setBounds(50,50,50,50);
        bt[8].setBounds(0,50,50,50);
        p.add(bt[0]);
        p.add(bt[1]);
        p.add(bt[2]);
        p.add(bt[3]);
        p.add(bt[4]);
        p.add(bt[5]);
        p.add(bt[6]);
        p.add(bt[7]);
        p.add(bt[8]);
        bt[8].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Screen = "";
                double a = Double.parseDouble(result.getText());
                a = Math.pow(a, 2);
                result.setText(Screen);
                result.setText(a+"");
            }
        });
        bt[7].addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e)
            {
                Screen = "";
                result.setText(Screen);
                result.setText(Math.PI+"");
            }
        });
        bt[6].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Screen = "";
                Double a = Double.parseDouble(result.getText());
                result.setText(Screen);
                a = -a;
                result.setText(a+"");
            }
        });
        bt[3].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Screen = "";
                double a = Double.parseDouble(result.getText());
                result.setText(Screen);
                a = Math.sin(a);
                result.setText(a+"");
            }
        });
        bt[4].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Screen = "";
                double a = Double.parseDouble(result.getText());
                result.setText(Screen);
                a = Math.cos(a);
                result.setText(a+"");
            }
        });
        bt[5].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Screen = "";
                double a = Double.parseDouble(result.getText());
                result.setText(Screen);
                a = Math.tan(a);
                result.setText(a+"");
            }
        });
        bt[2].addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e)
            {
                Screen = "";
                Double a = Double.parseDouble(result.getText());
                result.setText("");
                a = Math.log10(a);
                result.setText(a+"");
            }
        });
        bt[1].addActionListener(new ActionListener()
        {   
            public void actionPerformed(ActionEvent e)
            {
                Screen = "";
                Double a = Double.parseDouble(result.getText());
                result.setText("");
                a = Math.log(a);
                result.setText(a+"");
            }
        });
        bt[0].addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e)
            {
                if(e.getSource()==bt[0])
                {
                    Double a = Double.parseDouble(result.getText());
                    result.setText("");
                    a = 1/a;
                    result.setText(a+"");
                }
            }
        });
        b[0].setBounds(280,250,100,50);
        b[17].setBounds(190,250,50,50);
        b[1].setBounds(280,200,50,50);
        b[4].setBounds(280,150,50,50);
        b[7].setBounds(280,100,50,50);
        b[2].setBounds(330,200,50,50);
        b[5].setBounds(330,150,50,50);
        b[8].setBounds(330,100,50,50);
        b[3].setBounds(380,200,50,50);
        b[6].setBounds(380,150,50,50);
        b[9].setBounds(380,100,50,50);
        b[10].setBounds(430,200,50,50);
        b[11].setBounds(430,150,50,50);
        b[13].setBounds(430,100,50,50);
        b[12].setBounds(430,50,50,50);
        b[14].setBounds(380,50,50,50);
        b[16].setBounds(280,50,100,50);
        b[15].setBounds(380,250,50,50);
        c.add(result, BorderLayout.NORTH);
        c.add(p);
        setSize(500, 500);
        setVisible(true);
        //setResizable(false);
        setLocationRelativeTo(null);        
    }//End Constructor
    
    public static void main(String[] args)
    {
        new Calculator();
    }

    //------------------------------------------------			
    
    public void actionPerformed(ActionEvent event)
    {
        for (int i = 0; i <= 9; i++)//Numbers
        {
            if (event.getSource() == b[i])
            {
                Screen += i;
                result.setText("");
                result.setText(Screen);
            }
        }
        if(event.getSource() == b[17])
        {
            result.setText(factorial(Double.parseDouble(result.getText()))+"");
        }
        for (int i = 10; i <= 15; i++)//Commands
        {
            if (event.getSource() == b[i])
            {
                if (result.getText().lastIndexOf(OperationOnScreen) != -1)
                {
                    result.setText(result.getText().substring(0, result.getText().lastIndexOf(OperationOnScreen)) + s[i]);
                } else
                {
                    result.setText(result.getText() + s[i]);
                }
                OperationOnScreen = s[i];

                if (switcher)
                {
                    monitor1 = s[i];
                    switcher = false;
                } else
                {
                    monitor2 = s[i];
                    switcher = true;
                }

                if (monitor1 != monitor2 && monitor2 != "")
                {
                    if (switcher) //execute older,send sign newer
                    {
                        Calc(event, monitor1.charAt(0), monitor2);
                    } else
                    {
                        Calc(event, monitor2.charAt(0), monitor1);
                    }
                }
                if (s[i] != "=") //calc returns 0
                {
                    Calc(event, s[i].charAt(0), s[i]);
                }
            }
        }

        if (event.getSource() == b[16]) //Clear
        {
            Screen = "";
            monitor1 = "";
            monitor2 = "";
            switcher = true;
            CommandEmpty = true;
            result.setText("");
        }
        
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
    }//end actionPerformed

    
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

    
    public void Calc(ActionEvent event, char OpType, String Operator)
    {
        if (Operator == "=")
        {
            Operator = "";
        }

        if (CommandEmpty && Screen == "")
        {
            return;
        } else if (CommandEmpty && Screen != "")
        {
            R = Integer.parseInt(Screen);
            result.setText(Screen + Operator);
            Screen = "";
            CommandEmpty = false;
        } else if (!CommandEmpty && Screen != "")
        {
            L = Integer.parseInt(Screen);
            R = Operations(R, L, OpType);//calculate
            Screen = "";
            result.setText("");
            result.setText(R + Operator);
        }
    }//End Calc				

    public static double Operations(double R, double L, char op)
    {
        switch (op)
        {
            case '+':
                return R + L;
            case '-':
                return R - L;
            case '*':
                return R * L;
            case '/':
                return R / L;
            case '%':
                return R % L;
        }
        return 0;
    }
}//end class
