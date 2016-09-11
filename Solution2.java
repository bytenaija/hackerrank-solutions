import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
         int [] a = new int [3];
         int [] b = new int [3];
        int alice = 0;
        int bob = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i< 3; i++){
            
            a[i] = in.nextInt();
            
            if (a[i] < 0 || a[i] > 100){
                
                
            a[i] = in.nextInt();
        }
           
        
    }
        
         for (int i = 0; i< 3; i++){
            
             
           b[i] = in.nextInt();
           if (b[i] < 0 || b[i] > 100){
            
            b[i] = in.nextInt();
        }
        
    }
        
//        int a0 = in.nextInt();
//        int a[1] = in.nextInt();
//        int a[2] = in.nextInt();
//        
//        int b0 = in.nextInt();
//        int b[1] = in.nextInt();
//        int b[2] = in.nextInt();
        
        if (a[0] > b[0]){
            alice++;
        } else if( b[0] > a[0] ){
            bob++;
        }
        
        if (a[1] > b[1]){
            alice++;
        } else if( b[1] > a[1] ) {
            bob++;
        }
        
        if (a[2] > b[2]){
            alice++;
        } else if( b[2] > a[2] ) {
            bob++;
        }
        
        System.out.println(alice + " " + bob);
    }
}
