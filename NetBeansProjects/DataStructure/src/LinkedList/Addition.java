package LinkedList;

import java.util.Scanner;

class naviList{
    int data;
    naviList next;
    naviList(int data)
    {
        this.data = data;
        this.next = null;
    }

    naviList()
    {
        this.next = null;
    }
}

public class Addition
{
    public static naviList Insert(naviList op)
    {
       Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        op.data = data;
        naviList current = op;
        while(true)
        {
            data = sc.nextInt();
            if(data == -1)
                break;
            else
            {
                naviList temp = new naviList(data);
                op.next = temp;
                op = temp;
            }
        }
        op = current;
        return op;
    }
    
    public static void Print(naviList o)
    {
        naviList temp = o;
        while(temp != null)
        {
            System.out.print(temp.data +" " );
            temp = temp.next;
        }
    }
    
    public static naviList Add(naviList first,naviList second)
    {
        naviList res = null; // res is head node of the resultant list
        naviList prev = null;
        naviList temp = null;
        int carry = 0, sum;
 
        while (first != null || second != null) //while both lists exist
        {
            // Calculate value of next digit in resultant list.
            // The next digit is sum of following things
            // (i)  Carry
            // (ii) Next digit of first list (if there is a next digit)
            // (ii) Next digit of second list (if there is a next digit)
            sum = carry + (first != null ? first.data : 0)
                    + (second != null ? second.data : 0);
 
            // update carry for next calulation
            carry = (sum >= 10) ? 1 : 0;
 
            // update sum if it is greater than 10
            sum = sum % 10;
 
            // Create a new node with sum as data
            temp = new naviList(sum);
 
            // if this is the first node then set it as head of
            // the resultant list
            if (res == null) {
                res = temp;
            } else // If this is not the first node then connect it to the rest.
            {
                prev.next = temp;
            }
 
            // Set prev for next insertion
            prev = temp;
 
            // Move first and second pointers to next nodes
            if (first != null) {
                first = first.next;
            }
            if (second != null) {
                second = second.next;
            }
        }
 
        if (carry > 0) {
            temp.next = new naviList(carry);
        }
 
        // return head of the resultant list
        return res;
    }
    
    public static naviList reverse(naviList head)
    {
        naviList prev = null;
        naviList nextn ;
        while(head != null)
        {
            nextn = head.next;
            head.next = prev;
            prev = head;
            head = nextn;
        }
        return prev;
    }
    
    public static void main(String[] args)
    {
        naviList op1 = new naviList();
        naviList op2 = new naviList();
        naviList op3 = new naviList();
        op1 = Insert(op1);
        op2 = Insert(op2);
        op3 = Add(op1,op2);
        Print(op1);
        System.out.println("");
        Print(op2);
        System.out.println("");
        
        Print(op3);
        System.out.println("");
    }
}
