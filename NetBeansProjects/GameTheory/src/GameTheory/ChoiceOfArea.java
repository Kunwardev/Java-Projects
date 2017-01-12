/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GameTheory;

/**
 *
 * @author Kunwar
 */
class Area{
    int x, y;
    Area(int a,int b){
        x = a;
        y = b;
    }
}

class Power{
    int a,b;
    Power(int x,int y){
        a = x;
        b = y;
    }
}

public class ChoiceOfArea
{
    
    private static int max(int a, int b){
        return (a > b)? a: b;
    }
    
    private static int Function(Power A, Area X[],int last,int count){
        int temp = 0,x1=0,y1=0,x2=0,y2=0;
        if((A.a <= 0 || A.b <= 0) && count > 1){
            return count;
        }else{
                A.a = X[last].x + A.a;
                A.b = X[last].y + A.b;
                System.out.println(A.a + " "+ A.b + " "+last);
                count++;
        }

        switch(last){
            case 0:
                x1 = X[1].x + A.a;
                x2 = X[2].x + A.a;
                y1 = X[1].x + A.b;
                y2 = X[2].x + A.b;
                if(x1 + y1 < x2 + y2)
                    count = Function(A, X, 1, count);
                else
                    count = Function(A, X, 2, count);
                break;
            case 1:
                x1 = X[0].x + A.a;
                x2 = X[2].x + A.a;
                y1 = X[0].y + A.b;
                y2 = X[2].y + A.b;
                if(x1 + y1 < x2 + y2)
                    count = Function(A, X, 0, count);
                else
                    count = Function(A, X, 2, count);
                break;
            case 2:
                x1 = X[0].x + A.a;
                x2 = X[1].x + A.a;
                y1 = X[0].y + A.b;
                y2 = X[1].y + A.b;
                if(x1 + y1 < x2 + y2)
                    count = Function(A, X, 0, count);
                else
                    count = Function(A, X, 1, count);
                break;
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        Power A = new Power(20, 8);
        Area X[] = new Area[3];
        X[0] = new Area(3, 2);
        X[1] = new Area(-5, -10);
        X[2] = new Area(-20, 5);
        System.out.println(Function(A, X, 0, 0));
        System.out.println(Function(A, X, 1, 0));
        System.out.println(Function(A, X, 2, 0));
    }
    
}
