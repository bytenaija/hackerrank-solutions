/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author EVA
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution5 {

    public static void main(String[] args) {
        double pfraction = 0.00000;
       double nefraction = 0.00000;
      double  zerofraction = 0.00000;
        Scanner in = new Scanner(System.in);
        int positive=0, negative = 0, zero = 0;
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if (arr[arr_i] >  0){
                positive++;
                 System.out.println("Positive: " + positive);
            }else if (arr[arr_i] <  0){
                negative++;
                System.out.println("Negative: " + negative);
            } else{
                zero++;
                System.out.println("Zeros: " + zero);
            }
        }
        
      pfraction = (double)positive / n;
       nefraction = (double)negative / n;
     zerofraction = (double)zero / n;
        
        System.out.println(pfraction);
        System.out.println(nefraction);
        System.out.println(zerofraction);
    }
}

