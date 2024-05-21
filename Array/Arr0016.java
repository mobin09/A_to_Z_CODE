import java.util.ArrayList;
import java.util.Arrays;

public class Arr0016 {
    public static void main(String[] args){
       int[][] arr = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
       int n = arr[0].length -2;
       int[][] matrix = new int[n][n];
       ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
       for(int i=0; i<arr[0].length; i++){
        int max = Integer.MIN_VALUE;
          for(int j=0; j<arr[i].length; j++){
            int data = arr[j][i];
            if(data > max){
                max = data;               
            }
          }
          ArrayList<Integer> l = new ArrayList<>();
          l.add(max);
          lst.add(l);
          // here we will get the max value from the above matrix;;;;;

    
       }
    //    for(int[] a: matrix){
    //     System.out.println(Arrays.toString(a));
    //    }
       System.out.println(lst);
       for(int i=0; i<n;i++){
        
       }
       //System.out.println(matrix);

    }
}
