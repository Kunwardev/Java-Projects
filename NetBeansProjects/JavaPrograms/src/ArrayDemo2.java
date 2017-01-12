public class ArrayDemo2 
{
    public static void main(String[] args) 
    {
    int a[][]={{1,2,3},{3,5,7},{9,8,3}};
    for(int i=0;i<a.length;i++)
    {
        for (int j = 0; j < a[i].length; j++)
        {
            if(i!=1&&j!=1)
            {
                System.out.print("  ");
            }
            else
            {
                System.out.print(a[i][j]+" ");
            }
        }System.out.println();
    }
    }
}
