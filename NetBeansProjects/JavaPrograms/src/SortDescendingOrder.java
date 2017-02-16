
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */
class Person /*implements Comparable<Person>*/{
        int id;
        String firstName;
        String lastName;
        int salary;
        
        Person(int id,String nam,String name, int salary){
            this.id = id;
            this.firstName = nam;
            this.lastName = name;
            this.salary = salary;
        }
/*
    @Override
    public int compareTo(Person o)
    {
        if(this.salary == o.salary)
            return 0;
        else if(this.salary > o.salary)
            return -1;
        else
            return 1;
    }*/
}


public class SortDescendingOrder {
    private static void Print(){
        List<Person> al = new ArrayList<>();
        al.add(new Person(1, "K", "D", 10000));
        al.add(new Person(5, "l", "F", 20114));
        al.add(new Person(8, "G", "L", 1500));
        Collections.sort(al,new Comparator<Person>()
        {

            @Override
            public int compare(Person o1, Person o2)
            {
                if(o1.salary > o2.salary)
                    return -1;
                else if(o1.salary < o2.salary)
                    return 1;
                else
                    return 0;
            }
        });
        for(Person p: al){
            System.out.println("Name -> "+p.firstName+" "+p.lastName);
            System.out.println("Salary -> "+p.salary);
            System.out.println("ID -> "+p.id);
            System.out.println();
        }
    }
        
    public static void main(String[] args)
    {
        Print();
    }
    
    
}