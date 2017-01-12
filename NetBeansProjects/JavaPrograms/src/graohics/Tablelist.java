package graohics;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class Tablelist extends JFrame
{   
    JTable jt;
    JScrollPane sp;
    TableModel tm;
    Tablelist()
    {
        tm = new TableModel();
        setLayout(null);
        jt = new JTable(tm);
        sp = new JScrollPane(jt);
        sp.setBounds(20,50,200,200);
        add(sp);
        setSize(500,500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        al.add(new Student(1,"k"));
        al.add(new Student(1,"k"));
        al.add(new Student(1,"k"));
        al.add(new Student(1,"k"));
        al.add(new Student(2,"h"));
        al.add(new Student(3,"g"));
        al.add(new Student(4,"f"));
        al.add(new Student(5,"d"));
        al.add(new Student(1,"k"));
        al.add(new Student(1,"k"));
        al.add(new Student(1,"k"));
        al.add(new Student(1,"k"));
        al.add(new Student(2,"h"));
        al.add(new Student(3,"g"));
        al.add(new Student(4,"f"));
        al.add(new Student(5,"d"));
        al.add(new Student(1,"k"));
        al.add(new Student(1,"k"));
        al.add(new Student(1,"k"));
        al.add(new Student(1,"k"));
        al.add(new Student(2,"h"));
        al.add(new Student(3,"g"));
        al.add(new Student(4,"f"));
        al.add(new Student(5,"d"));
        al.add(new Student(1,"k"));
        al.add(new Student(1,"k"));
        al.add(new Student(1,"k"));
        al.add(new Student(1,"k"));
        al.add(new Student(2,"h"));
        al.add(new Student(3,"g"));
        al.add(new Student(4,"f"));
        al.add(new Student(5,"d"));
    }
    
    public static void main(String[] args) {
        Tablelist tl = new Tablelist();
    }
    
    class Student
    {
        int r;
        String n;
        Student(int ro,String na)
        {
            r = ro;
            n = na;
        }
    }
    ArrayList <Student> al = new ArrayList<>();
    
    class TableModel extends AbstractTableModel
    {
        String title[] = {"RollNo","Name"};
        public String getColumnName(int a)
        {
            return title[a];
        }


        public int getRowCount()
        {
            return al.size();
        }

        public int getColumnCount() {
            return title.length;
        }

        public Object getValueAt(int rowIndex, int columnIndex) 
        {
            if(columnIndex == 0)
            
                return al.get(rowIndex).r;
            
            else if(columnIndex == 1)
            
                return al.get(rowIndex).n;
            return null;
           
            
        }
    }
    
}
