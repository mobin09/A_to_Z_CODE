import java.util.Arrays;

public class Arr0032 {

   public static void merge(int[] arr, int low, int mid, int high){
      int n1 = mid-low+1;
      int n2 = high -mid;
      int[] L = new int[n1];
      int[] R = new int[n2];

     for(int m=0; m<n1; m++){
        L[m] = arr[low+m];
     }

     for(int n=0; n<n2; n++){
        R[n] = arr[mid+1 +n];
     }

      int i=0;
      int j = 0;
      int k=low;
      while(i < n1 && j < n2){
           if(L[i] < R[j] ){
              arr[k] = L[i];
              i++;            
           }else{
              arr[k] = R[j];
              j++;
           }
           k++;
      }

      while(i <n1){
        arr[k] = L[i];
        k++;
        i++;
      }

      while(j < n2){
        arr[k] = R[j];
        k++;
        j++;
      }

   }

    public static void sort(int[] arr, int low, int high){
        if(low < high){
            int mid = low + (high -low) /2;
            sort(arr, low, mid);
            sort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        //Move all negative numbers to beginning 
        //and positive to end with constant extra space
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int low = 0;
        int high = arr.length -1;
        //Arrays.sort(arr);
     
        // merge sort
       sort(arr, low, high);

       System.out.println(Arrays.toString(arr));
    }
}
