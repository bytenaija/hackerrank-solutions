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

public class Solution7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = n; i > 0; i--){
            System.out.println(assg(i)+ assgs(n+1-i));
        }
    }
    
    public static String assg(int b){
        String result = "";
        for (int i = 1; i < b; i++){
            
            result += " " ;
        }
        return result;
    }
    
    public static String assgs(int b){
        
        String result = "";
        for (int i = 1; i <= b; i++){
            result += "#" ;
        }
        return result;
    }
}
