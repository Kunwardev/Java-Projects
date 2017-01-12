package graohics;

import javax.swing.*;
import javax.swing.table.*;

public class Table extends JFrame
{
    JButton bt1,bt2;
    JTable jt;
    JScrollPane sp;
    Table()
    {
        bt1 = new JButton(">>");
        bt2 = new JButton("<<");
        MyTable1 mt = new MyTable1();
        jt = new JTable();
        jt.setModel(mt);
        sp = new JScrollPane(jt);
        sp.setBounds(20,50,200,100);
        add(sp);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        Table obj = new Table();
    }
}
