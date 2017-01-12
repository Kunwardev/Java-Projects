public class multiarray
{
    public static void main(String[] args) {
   int mat[][] = new int[5][];
   int x=0;
   for(int i =0;i<5;i++)
   {
       mat[i] = new int[i+1];
   }
   for(int i=0;i<5;i++)
   {
       for(int j=0;j<i;j++)
       {
           mat[i][j] = x;
           x++;
       }
   }
   for(int i =0;i<5;i++)
   {
       for(int j=0;j<i;j++)
           System.out.print(mat[i][j]);
       System.out.println();
   }
}
}
