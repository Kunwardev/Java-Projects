package Learn;
import java.util.Scanner;
/**
 *
 * @author Kunwar
 */
public class javachallenge2
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        String name = getName();
        double total = printTotal(name);
        System.out.println("The total Expense for one year will be: "+ total);
    }

    private static String getName()
    {
        System.out.println("Enter Your Name: ");
        String name = in.nextLine();
        return name;
    }
    private static double printTotal(String name)
    {
        double total = 100;
        double year = getYear();
        total+=year;
        double credits = getCredits();
        total +=credits;
        return total;
    }

    private static double getYear()
    {
        double year = 0;
        System.out.println("1. Freshman\n2. Sophomore\n3.Prefinal\n4. Final");
        int x = in.nextInt();
        switch(x)
        {
            case 1:
                year+= 10;
                break;

            case 2:
                year+=15;
                break;
                
            case 3:
            case 4:
                year+=20;
                break;
        }
        return year;
    }

    private static double getCredits()
    {
        System.out.println("How many Credits are you availing: ");
        int z = in.nextInt();
        System.out.println("What is the Cost of Each Credit? ");
        double cost = in.nextDouble();
        cost *= z;
        return cost;
    }
}