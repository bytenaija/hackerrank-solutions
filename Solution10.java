
package hackerrank;


 import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int n = in.nextInt();
        String b = in.nextLine();
        String [] bc = b.split(" ");
        for (int i = 0; i< n; i++){
            if (Integer.parseInt(bc[i]) == v){
                System.out.println(i);
            }
        }
        
    }
}
