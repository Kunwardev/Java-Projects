public class Student
{
    int roll_no = 1;
    String name = "Kunwar";
    double marks = 45.63;
    void show()
    {
        System.out.println("Name    = "+name);
        System.out.println("Roll no = "+roll_no);
        System.out.println("Marks   = "+marks);
    }
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.show();
        System.out.println();
        s1.marks = 100.25;
        s1.name = "Sukhreet";
        s1.roll_no = 2;
        s1.show();
    }
}
