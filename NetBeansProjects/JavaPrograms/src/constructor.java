public class constructor
{
    int rollno;
    String name;
    double marks;
    constructor()
    {
        rollno = 1;
        name = "Abc";
        marks = 33.33;
    }
    void display()
    {
        System.out.println("Roll number is "+rollno);
        System.out.println("Name is "+name);
        System.out.println("Marks is "+marks);
    }
    public static void main(String[] args) 
    {
        constructor C = new constructor();
        C.display();
        C.marks = 50;
        C.name = "Kunwar";
        C.rollno = 2;
        C.display();
    }
}
