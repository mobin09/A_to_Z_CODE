import java.util.Arrays;

public class Arr6 {
    static int insertKey(int[] arr, int capacity, int n, int data){
        if(n >= capacity){
            return -1; // already array is filled
        }
        int i;
        for(i=n-1; i>=0 && arr[i] > data; i--){
            arr[i+1] = arr[i];
        }
        arr[i+1] = data;
    return n+1;   
    }
    public static void main(String[] args) {
        int arr[] = new int[20]; 
        arr[0] = 12; 
        arr[1] = 16; 
        arr[2] = 20; 
        arr[3] = 40; 
        arr[4] = 50; 
        arr[5] = 70; 
        int capacity = arr.length; 
        int n = 6; 
        int key = 26;
        int i= insertKey(arr, capacity, n, key);
        System.out.println(Arrays.toString(arr));   
    }
}
