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
public class Solution9 {

    public static void main(String[] args) {
        int n, k, q;
        int[] arr;
        Scanner in = new Scanner(System.in);
        do {
            do {
                do {
                    String de = in.nextLine();
                    
                    String[] ds = de.split(" ");
                    n = Integer.parseInt(ds[0]);
                    k = Integer.parseInt(ds[1]);
                    q = Integer.parseInt(ds[2]);
                } while (q < 0 || q > 500);
            } while (k < 0 || k > Math.pow(10, 5));
        } while (n < 0 || n > Math.pow(10, 5));
        arr = new int[n];
       // for (int i = 0; i < n; i++) {
            String[] ds;
            String de;
            do {
                de = in.nextLine();
                ds = de.split(" ");
                System.out.println(de);
            } while (Integer.parseInt(ds[i]) < 0 || Integer.parseInt(ds[i]) > Math.pow(10, 5));
            arr[i] = Integer.parseInt(ds[i]);
    /////      }

        int g = 1;
        do {
            int temp = arr[0];

            for (int i = 0; i < n; i++) {
                if (i + 1 == n) {

                    arr[n - 1] = temp;

                } else {

                    arr[i] = arr[i + 1];
                }
            }

            g++;
        } while (g <= k);

        for (int i = 0; i <= q; i++) {
            int m;
            do {
                m = in.nextInt();
            } while (m < 0 || m > n - 1);
            System.out.println(arr[m]);
        }
    }

}
