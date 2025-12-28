package step1;

// https://www.codechef.com/practice/course/arrays/ARRAYS/problems/KITCHENCOST

import java.util.Arrays;
import java.util.Scanner;

public class Day04{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T != 0){
            int N = sc.nextInt();
            int X = sc.nextInt();

            int[] freshness = new int[N]; //freshness of each items
            for(int i=0; i<N; i++){
                freshness[i] = sc.nextInt();
            }

            int[] cost = new int[N]; //cost of each item 
            for(int i=0; i<N; i++){
                cost[i] = sc.nextInt();
            }
            //Find the total cost of the groceries Chef buys.
           int costSum = 0;
           for(int i=0; i<N; i++){
             if(freshness[i] >= X){
                 costSum += cost[i];
             }
           }
          
           System.out.println(costSum);

            T--;
        }
    }
}