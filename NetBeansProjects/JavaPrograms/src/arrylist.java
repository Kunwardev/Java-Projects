
import java.util.*;

public class arrylist {

    static class Student {

        String name;
        int rollNo;

        Student(int r, String n) {
            rollNo = r;
            name = n;
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(1, "Kunwar"));
        al.add(new Student(2, "Dev"));
        Student e = new Student(3, "Pain");
        al.add(e);
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i).name+"    "+al.get(i).rollNo);
        }
    }
}
