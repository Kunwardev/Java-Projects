import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.*;

public class Records extends JFrame implements ActionListener
{
    int i =0;
    ArrayList <Student> al = new ArrayList<>();
    JTable jt;
    Label lb1,lb2,lb3;
    TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9;
    JButton bt1,bt2,bt3,bt4;
    TableModel tm;
    JScrollPane sp;

     Records()
    {
        super("Record List");
        al.add(new Student(1,33.33,"Kunwar"));
        al.add(new Student(2,33.43,"Kunwa"));
        al.add(new Student(3,33.53,"Kunwr"));
        al.add(new Student(4,33.63,"Kunar"));
        al.add(new Student(5,33.83,"Kuwar"));
        al.add(new Student(6,33.93,"Knwar"));
        al.add(new Student(7,33.13,"unwar"));
        setSize(600,600);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jt = new JTable();
        tm = new TableModel();
        jt.setModel(tm);
        tf1 = new TextField(" Roll No : ");
        tf2 = new TextField(" Marks  ");
        tf3 = new TextField(" Name  ");
        tf4 = new TextField("Roll No ");
        tf5 = new TextField("Marks ");
        tf6 = new TextField("Name ");
        tf7 = new TextField();
        tf8 = new TextField();
        tf9 = new TextField();
        tf4.setBounds(20,300,50,30);
        tf4.setEditable(false);
        add(tf4);
        tf5.setBounds(20,350,50,30);
        tf5.setEditable(false);
        add(tf5);
        tf6.setBounds(20,400,50,30);
        tf6.setEditable(false);
        tf7.setBounds(80,300,100,30);
        add(tf7);
        tf8.setBounds(80,350,100,30);
        add(tf8);
        tf9.setBounds(80,400,100,30);
        add(tf9);
        add(tf6);
        lb1 = new Label("==============");
        lb2 = new Label("==============");
        lb3 = new Label("==============");
        tf1.setBounds(300,50,50,30);
        tf2.setBounds(300,100,50,30);
        tf3.setBounds(300,150,50,30);
        lb1.setBounds(360,50,100,30);
        lb2.setBounds(360,100,100,30);
        lb3.setBounds(360,150,100,30);
        add(tf1);
        add(tf2);
        add(tf3);
        add(lb1);
        add(lb2);
        add(lb3);
        sp = new JScrollPane(jt);
        sp.setBounds(20,50,250,150);
        add(sp);
        bt1 = new JButton(">>");
        bt2 = new JButton("<<");
        bt3 = new JButton("Insert");
        bt4 = new JButton("Delete");
        bt1.setBounds(20,210,100,30);
        bt2.setBounds(150,210,100,30);
        bt3.setBounds(20,250,100,30);
        bt4.setBounds(150,250,100,30);
        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
    }
    
     public static void main(String[] args)
    {
        Records obj = new Records();
    }

    public void actionPerformed(ActionEvent e)
    {
        
        if(e.getSource() == bt1)
        {
            lb1.setText(al.get(i).r+"");
            lb2.setText(al.get(i).m+"");
            lb3.setText(al.get(i).n+"");
            i++;
            if(i==al.size())
            {
                i--;
                JOptionPane.showMessageDialog(this,"No more Students in the right side of list");
            }
        }
        
        if(e.getSource()==bt2)
        {
            i--;
            lb1.setText(al.get(i).r+"");
            lb2.setText(al.get(i).m+"");
            lb3.setText(al.get(i).n+"");
            if(i==0)
            {
                i++;
                JOptionPane.showMessageDialog(this,"No more Students in the left side of List");
            }
        }
        if(e.getSource()==bt3)
        {
            if(tf7.getText().equals("")||tf8.getText().equals("")||tf9.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Fill the Information Correctly");
            }
            else{
            Student f = new Student(Integer.parseInt(tf7.getText()),Double.parseDouble(tf8.getText()),tf9.getText());
            al.add(f);
            tf7.setText("");
            tf8.setText("");
            tf9.setText("");
            tm.fireTableDataChanged();
        }
        }
            if(e.getSource()==bt4)
            {
                int r = jt.getSelectedRow();
                if(r==-1)
                {
                    JOptionPane.showMessageDialog(this, "Select a row first");
                }
                else{
                al.remove(r);
                tm.fireTableDataChanged();
            }
            }
    }
     
     class Student 
     {
         int r;double m;String n;
         Student(int r,double m,String n)
         {
             this.r = r;
             this.m = m;
             this.n = n;
         }
     }
     
     class TableModel extends AbstractTableModel
     {
         
         String title[]={"Roll","Marks","Name"};
        public int getRowCount()
        {
            return al.size();
        }

        public int getColumnCount()
        {
            return title.length;
        }
        
        public String getColumnName(int a)
        {
            return title[a];
        }
        public Object getValueAt(int rowIndex, int columnIndex)
        {
            if(columnIndex == 0)
            return al.get(rowIndex).r;
            if(columnIndex==1)
            return al.get(rowIndex).m;
            else
                return al.get(rowIndex).n;
        }
     }
}
