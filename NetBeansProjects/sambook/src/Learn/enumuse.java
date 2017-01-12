package Learn;
import java.util.EnumSet;
public class enumuse
{
    public static void main(String[] args)
    {
        for(enumerate people: enumerate.values())
        {
            System.out.printf("%s\t%s\t%s\n",people, people.desc(),people.year());
        }
        System.out.println("RANGE");
        for(enumerate people: EnumSet.range(enumerate.dev,enumerate.ujwal))
            System.out.printf("%s\t%s\t%s\n",people, people.desc(),people.year());

    }
}
