public class Benchmark
{
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
        long endtime = starttime+60000;
        long index = 0;
        while(true)
        {
            double x = Math.sqrt(index);
            long now = System.currentTimeMillis();
            if(now >=endtime)
                break;
            index++;
        }
        System.out.println("Number of Loops: "+index);
}
}
