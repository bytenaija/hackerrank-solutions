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

public class Solution3 {

    public static void main(String[] args) {
        long sum2 = 0;
        Scanner in = new Scanner(System.in);
        int n =0;
        do{
            n = in.nextInt();
        }while (n < 1  || n > 10);
           
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if (arr[arr_i] < 0 || arr[arr_i] > Math.pow(arr[arr_i], 10)){
                arr[arr_i] = in.nextInt();
            }
            
            sum2 += arr[arr_i];
        }
        
        System.out.println(sum2);
    }
}

