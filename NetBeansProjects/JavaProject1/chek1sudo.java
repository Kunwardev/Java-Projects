public class chek1sudo
{
    boolean func(int a[][],int i,int j){
        int k,l;
        for(k=0;k<i;k++)
        {
            for(l=0;l<j;l++)
            {
                if(a[k][l] == 3)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
   int q = 3,r=3;
   int b[][] = {{1,2,4},{6,2,7},{1,3,5},{1,5,6}};
  /* boolean check = func(b[][],q,r);
   if(check == false)
   {System.out.println("Success");}
   else
            System.out.println("Failure");*/
        System.out.println(b.length);
        
}
}
