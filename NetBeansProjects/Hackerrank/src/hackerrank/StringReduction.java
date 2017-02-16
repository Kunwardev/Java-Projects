/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Kunwar
 */
public class StringReduction
{
    /* Head ends here */
	private static boolean isSame(String str){
		for(int i = str.length() - 1; i > 0; i--){
			if(str.charAt(i) != str.charAt(i-1)) return false;
		}
		return true;
	}
	
	private static int solve(String ln){
		if(isSame(ln)) return ln.length();
		int[] count = new int[3];
		for(int i = ln.length() - 1; i >= 0; i--){
			char c = ln.charAt(i);
			count[c - 'a']++;
		}
		
		if(ln.length() % 2 == 0){
			// even
			for(int i = 0; i < 3; i++){
				if(count[i] % 2 != 0) return 1;
			}
			return 2;
		} else {
			// odd
			for(int i = 0; i < 3; i++){
				if(count[i] % 2 == 0) return 1;
			}
			return 2;
		}
		

	}
    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _t_cases = Integer.parseInt(in.nextLine());
        for (int _t_i = 0; _t_i<_t_cases; _t_i++) {
            String _a = in.nextLine();
            res = solve(_a);
            System.out.println(res);
        }
    }
}
