/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author Kunwar
 */

class Person implements Comparator<Person>{
    String name;
    int salary;
    
    Person(){};
    
    Person(String x,int s){
        name = x;
        salary = s;
    }

    public int compare(Person o1, Person o2)
    {
        if(o1.salary > o2.salary)
            return 1;
        else if(o1.salary < o2.salary)
            return -1;
        else
            return 0;
    }
}

public class priorityqueue
{
    public static void main(String[] args)
    {
        Person p = new Person();
        PriorityQueue<Person> pq = new PriorityQueue<>(4, p);
        pq.add(new Person("K",1));
        pq.add(new Person("D",10));
        pq.add(new Person("S",20));
        pq.add(new Person("P",15));
        while(pq.size()!=0){
            Person ps = pq.poll();
            System.out.println("Name -> "+ps.name);
            System.out.println("Salary -> "+ps.salary);
            System.out.println("");
        }
    }
}
