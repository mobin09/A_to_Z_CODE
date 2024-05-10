// https://www.codechef.com/practice/course/arrays/ARRAYS/problems/OPMIN

import java.util.Arrays;

public class Day05 {
      public static void main(String[] args){
        int[] arr = {1,2};

        int min = Arrays.stream(arr).min().getAsInt();
       long l = Arrays.stream(arr).filter(ele -> ele > min).count();
       System.out.println(l);
      } 
}
