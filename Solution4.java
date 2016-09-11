/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution4 {

    public static void main(String[] args) {
        int primary = 0;
        int secondary = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        
         for(int a_i=0; a_i < n; a_i++){
            primary +=  a[a_i][a_i];
            
        }
         int a_j;
        for(int a_i=0; a_i < n; a_i++){
            a_j = n - a_i -1;
            secondary +=  a[a_i][a_j];
            
            
        }
        
        System.out.println(Math.abs(primary-secondary));
    }
}

