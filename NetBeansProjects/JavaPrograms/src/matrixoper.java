public class matrixoper
{
    public static void main(String[] args) 
    {
        int a[][]={{3,5,1},{2,1,6},{9,8,3}};
        int b[][]={{3,9,1},{5,6,3},{8,2,1}};
        int c[][]=new int[3][3];
        int d[][] = {{0,0,0},{0,0,0},{0,0,0}};
        System.out.println("Addtiton of the Matrices");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(" "+c[i][j]+" ");
            }System.out.println();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                for(int k=0;k<a[i].length;k++)
                {
                    d[i][j] = a[i][k]*b[k][j]+d[i][j];
                }
                 
            }
        }
        
        System.out.println("Multiplication of Matrices");
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(+d[i][j]+" ");
            }System.out.println();
        }
        
    }
}
