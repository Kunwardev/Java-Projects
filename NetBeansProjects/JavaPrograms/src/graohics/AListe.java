
package graohics;

import java.awt.*;
import java.awt.event.*;

public class AListe extends Frame 
{
    List ls;
    Button bt;
    AListe()
    {
        setLayout(null);
        setVisible(true);
        setSize(400,400);
        ls = new List(3,true);
        bt = new Button("Click");
       // ls.setBounds(100,100,60,70);
        bt.setBounds(20,50,60,30);
        ls.add("Abc");
        ls.add("Def");
        ls.add("Ghi");
        ls.add("Jkl");
        ls.add("Mno");
        ls.add("Pqr");
        ls.add("Stu");
        ls.add("Vwx");
        ls.add("Yza");
        ls.add("Bcd");
        add(bt);
        add(ls);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        AListe al = new AListe();
    }
}
