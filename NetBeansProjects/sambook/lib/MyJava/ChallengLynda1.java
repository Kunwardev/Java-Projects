import java.util.Scanner;

public class ChallengLynda1
{
	public static void main(String[] args)
	{
		Scanner ina = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = ina.nextLine();
		System.out.println("Enter Your Age: ");
		int age = ina.nextInt();
		System.out.println("Hello " + name + " You are "+ age +" yrs old");
	}
}