package Schooling;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class PatternSet1 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;

        int line = Integer.parseInt(reader.readLine());
        int n  = line; // 2
 
        for(int i=0; i < n; i++){ // i-> 2, 1
             int print = n; // 2, 2
             int count = i;  // 2, 1
             for(int j = n; j > 0; j--){  // j-> 0,1    || 0

                for(int k = 0; k < n - i ; k++){ //k = 0,1,  0, 1  || 0 <2
                    System.out.print(j); // 2 , 2  1, 1     || 2
                }
                print--;
             }
             System.out.println();
        }


        //System.out.println("User input is " + line);
            
        
    }
}
