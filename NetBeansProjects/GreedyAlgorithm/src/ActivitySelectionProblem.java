public class ActivitySelectionProblem
{
    public static void ArrangeFinish(int start[],int finish[])
    {
        int j = 0;
        System.out.print(j);
        for(int i=1;i<start.length;i++)
        {
            if(finish[j] <= start[i])
            {
                System.out.print(i);
                j = i;
            }
        }
    }
    
    public static void main(String[] args) {
        int start[]  = {1, 3, 0, 5, 8, 5};
        int finish[] = {2, 4, 6, 7, 9, 9};
        ArrangeFinish(start, finish);
    }
    
}
