import java.util.Arrays;

public class Neetcode005 {

    public static int findMax(int[] arr, int start, int end){
        int max = Integer.MIN_VALUE;
        while(start < end){
            if(arr[start] > max){
                max = arr[start];
            }
            start++;
        }
        return max;
    }


    // int n = arr.length;
    // int[] result = new int[n];
    // int max = -1;
    // for(int i= n-1; i>=0; i--){
    //     result[i] = max;
    //     if(arr[i] > max){
    //         max = arr[i];
    //     }
    // }
    // return result;


    public static void main(String[] args) {
        int[] arr = {57010,40840,69871,14425,70605};
        if(arr.length != 1){
            for(int i=0; i< arr.length-1; i++){
                int max = Integer.MIN_VALUE;
                for(int j = i+1; j < arr.length; j++){
                    if(max < arr[j]){
                        max =arr[j];
                    }
                }
                System.out.println(max);
                arr[i] = max;
            }
        }
       
       arr[arr.length-1] = -1;
        System.out.println(Arrays.toString(arr));
    }
}
