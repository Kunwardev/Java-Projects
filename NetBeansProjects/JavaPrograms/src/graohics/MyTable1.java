package graohics;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class MyTable1 extends AbstractTableModel {

    String title[] = {"Name", "Marks", "RollNo"};
    String s[][] = {{"Kunwar", "33.33", "1"}, {"Dev", "14.52", "2"}, {"Singh", "55.66", "3"}, 
        {"Rattan", "65.43", "4"},{"56","56","59"},
        {"Rattan", "65.43", "4"},{"56","56","59"},
        {"Rattan", "65.43", "4"},{"56","56","59"}};

    public int getRowCount() {
        return s.length;
    }

    public int getColumnCount() {
        return title.length;
    }

    public String getColumnName(int a) {
        return title[a];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        return s[rowIndex][columnIndex];
    }

    
}
