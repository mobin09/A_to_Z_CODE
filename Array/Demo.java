import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
       int arr[] = {1, 2, 4, 5, 7, 8, 10};
       // 1 to N --> 
       int N = 10;
       int i =0;
       int missing = 0;
       int missingCount = 3;
       //int missingSecond = 0;
       List<Integer> list = new ArrayList<>();
       int k =1;
       while(i <  N - missingCount){
           if(arr[i] == k){
               k++;
           }else{
                missing = k;
                list.add(missing);
                k += 2;   
           }
          
           i++;
           
           
       }

       System.out.println("List here :::: " + list);

      // sum of all elements 
       int sum   =  N * (N+1) /2;  // sum of number

       // finding array sum
       int arraySum = 0;
       for(int j=0; j< arr.length; j++){
           arraySum += arr[j];
       }
       arraySum += missing;

       int otherMissing = sum - arraySum;
       System.out.println("First Missing::" + missing + "Second Missing::" + otherMissing);

   

    }
}
