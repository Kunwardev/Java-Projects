
package graohics;

import java.awt.*;
import java.awt.event.*;

public class Asslis1 extends Frame implements ActionListener
{
    int count =1;
    List ls1,ls2;
    Button bt1,bt2;
    Label lb1;
    Asslis1()
    {
        ls1 = new List();
        lb1 = new Label("");
        ls2 = new List();
        bt1 = new Button(">>");
        bt2 = new Button("<<");
        setLayout(null);
        setVisible(true);
        lb1.setBounds(280,280,200,100);
        setSize(500,500);
        add(lb1);
        ls1.add("Mahender Singh Dhoni");
        ls1.add("Rahul Dravid");
        ls1.add("Yuvraj Singh");
        ls1.add("Zaheer Khan");
        ls1.add("Yusuf Pathan");
        ls1.add("David Beckam");
        ls1.add("Ranveer Singh");
        ls1.add("shiv Patel");
        ls1.add("Harbajan Singh");
        ls1.add("Kunwar Dev Singh");
        ls1.add("Ram Kapoor");
        ls1.add("Rajnikant");
        ls1.add("Kamlesh ");
        ls1.add("Davinder Pal");
        ls1.add("Undertaker");
        ls1.add("Rey Mysterio");
        ls1.add("Rajat");
        ls1.add("Mohinder");
        ls1.add("Bishan Bedi");
        ls1.setBounds(20,50,150,200);
        ls2.setBounds(200,50,150,200);
        bt1.setBounds(20,250,50,30);
        bt2.setBounds(200,250,50,30);
        add(ls1);
        add(ls2);
        add(bt1);
        add(bt2);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        Asslis1 obj = new Asslis1();
    }

    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==bt1)
        {
            ls2.add(ls1.getSelectedItem());
            ls1.remove(ls1.getSelectedItem());
            count++;
            if(count==12)
        {
            lb1.setText("Team Selected");
            ls1.setEnabled(false);
        }
        }
        if(e.getSource()==bt2)
        {
            ls1.add(ls2.getSelectedItem());
            ls2.remove(ls2.getSelectedItem());
            count--;
            lb1.setText("");
            ls1.setEnabled(true);
        }
    }
}
