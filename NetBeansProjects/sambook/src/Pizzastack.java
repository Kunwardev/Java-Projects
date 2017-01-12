import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class TestClass {
 
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
    static long M[][] = new long [1001][1001];
 
    private static void H(int N)
    {
 
	for(int i=1; i<=N; ++i)
	    M[1][i] = 1;
 
	int L = N;
	for(int y=2; y<=N; ++y) {
	    for(int x=1; x<L; ++x) {
		M[y][x] = ( x * M[y-1][x] + M[y-1][x+1]) % 1000000007;
	    }
	    --L;
	}
    }
 
    private static int number() throws Exception
    {
	String line = br.readLine();
	//System.out.println("Line: " + line);
	int N = Integer.parseInt(line.trim());
	return(N);
    }
 
    public static void main(String[] args) throws Exception {
 
	H(1000);
 
	int N=number();
	
	for(int i=0; i<N; ++i) {
	    System.out.println(M[number()][1] );
	}
 
    }
}