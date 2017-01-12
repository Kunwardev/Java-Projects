public class ArrayDemo1
{
    public static void main(String[] args) {
    int a[][] ={{1,2,3,4,3},{5,6,7,8,6},{9,10,11,12,9},{13,14,15,16,8},{3,5,6,11,9}};
    for(int i = 0;i<a.length;i++)
    {
        for(int j=0;j<a[i].length;j++)
        {
            if(i+j==1||i+j==3||i+j==5||i+j==7)
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
