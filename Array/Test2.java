import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
       // A array contains [0,1,0,2,0,4,5,0], we need  output as [1,2,4,5,0,0,0] 

     int[] arr = {0,1,0,2,0,4,5,0};
     Arrays.sort(arr); 
     
     int[] returnArr = new int[arr.length];
     int zeroCount = 0;
     int index = 0;
     for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                zeroCount++;
            }else{
                index = i;
                break;
            }
     }
     int j = 0;
      while(index <  arr.length){
        returnArr[j] = arr[index];
        j++;
        index++;
      }

      for(int i=0; i<zeroCount; i++){
        returnArr[j] = 0;
      }

     System.out.println(Arrays.toString(returnArr));

     
    }
}
