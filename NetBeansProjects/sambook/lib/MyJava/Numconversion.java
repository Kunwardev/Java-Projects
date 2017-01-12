public class Numconversion
{
	public static void main(String[] args)
	{
		int firstarg = 0;
		if(args.length>0)
		{
			try{
			firstarg = Integer.parseInt(args[0]);
			}catch(NumberFormatException e)
			{
			System.out.println("Argument "+args[0]+" must be an integer");
			System.exit(1);
			}
			System.out.println("You entered "+firstarg);
		}
	}
}