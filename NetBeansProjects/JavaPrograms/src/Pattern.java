public class Pattern
{
    public static void main(String[] args)
    {
        int n = 0;
        do
        {
            switch(n)
            {
                case 0:
                case 8:
                    for(int i=0;i<9;i++)
                        System.out.print(" * ");
                    System.out.println();
                    break;
                
                case 1:
                case 7:
                    for(int i=0;i<9;i++)
                    {
                        if(i == 4)
                            System.out.print("   ");
                        else
                            System.out.print(" * ");
                    }System.out.println();
                    break;
                
                case 2:
                case 6:
                    for(int i=0;i<9;i++)
                    {
                        if(i==3||i==5||i==4)
                            System.out.print("   ");
                        else
                            System.out.print(" * ");
                    }System.out.println();
                    break;
                case 3:
                case 5:
                    for (int i = 0; i < 9; i++)
                    {
                        if(i==0||i==1||i==7||i==8)
                            System.out.print(" * ");
                        else
                            System.out.print("   ");
                    }System.out.println();
                    break;
                case 4:
                    for (int i = 0; i < 9; i++)
                    {
                        if(i==0||i==8)
                            System.out.print(" * ");
                        else
                            System.out.print("   ");
                    }System.out.println();
            }
            n++;
        }while(n<=8);
    }

}

