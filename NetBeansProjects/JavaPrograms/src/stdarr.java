import java.util.*;
public class stdarr
{
    int r;
    double m;
    String n;
    stdarr(int ro,double ma,String na)
    {
        r=ro;m=ma;
        n=na;
    }
    public static void main(String[] args) {
    ArrayList <stdarr> al = new ArrayList<>();
    stdarr s1 = new stdarr(1,22.5,"Abc");
    al.add(s1);
    al.add(new stdarr(2,12,"Pqr"));
    al.add(new stdarr(3,14.2,"Xyz"));
    stdarr s2 = new stdarr(4,15.6,"apx");
        System.out.println("The Size of The al is "+al.size());
    al.add(s2);
    System.out.println("The Size of The al is "+al.size());
    for(int i=0;i<al.size();i++){
            System.out.println("Student "+(i+1));
            System.out.println("RollNumber : "+al.get(i).r);
            System.out.println("Marks : "+al.get(i).m);
            System.out.println("Name : "+al.get(i).n);
    }
    }
}
