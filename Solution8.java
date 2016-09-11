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

public class Solution8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
         if (time.endsWith("AM")){
             if (time.startsWith("12")){
                 time = time.substring(time.indexOf(":"), time.indexOf("AM"));
                 time = "00" + time;
                 System.out.println(time);
             }else{
             System.out.println(time.substring(0, time.indexOf("AM")));
             }
         } else {
             
             if (time.startsWith("12")){
                
                 System.out.println(time.substring(0, time.indexOf("PM")));
                              
            
             }else{
             int hh = Integer.parseInt(time.substring(0, time.indexOf(":")));
             hh += 12;
             
             time = time.substring(time.indexOf(":"), time.indexOf("PM"));
             System.out.println(hh + time);
         }
         }
        
    }
}
