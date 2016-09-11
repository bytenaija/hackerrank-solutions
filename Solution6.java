/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author EVA
 */
public class Solution6 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int [] arr;
        int [] result;
        int n=0;
        do {
            n = in.nextInt();
            
        }while (n < 1 || n >= Math.pow(10, 6));
        arr = new int[n];
        result = new int[n];
        for (int i = 0; i < n; i++ ){
            do{
            arr[i]= in.nextInt();
            }while (arr[i]< 1 || arr[i] >= Math.pow(10, 9));
            
            
//            if (arr[i] % 2 == 0){
//                result[i] = arr[i] / 2;
//            } else {
//                result[i] = (arr[i] / 2) + 1; 
//            }
        }
        
        for (int i = 0; i < result.length; i++ ){
            
            System.out.println(result[i]);
        }
    }
}

