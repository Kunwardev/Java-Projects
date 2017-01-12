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
public class LisaWorkbook {
 
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int k = stdin.nextInt();
        int page = 1;
        int specialProblems = 0;
        for(int i = 0; i < n; i++) {
            int problemsPerChapter = stdin.nextInt();
            for(int p = 1; p <= problemsPerChapter; p++) {
                if(p == page) {
                    specialProblems++;
                }
                if((p != problemsPerChapter) && (p % k == 0)) {
                    page++;
                }
            }
            page++;
        }
        System.out.println(specialProblems);
        stdin.close();
    }
}