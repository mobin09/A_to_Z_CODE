import java.util.Arrays;
public class Arr2 {    
    static int insertAtEnd(int[] arr, int capacity, int n, int data){
            if(n >= capacity){
                return n; // array is already full 
            }
            arr[n] = data;
            return n;
    }
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int n = 6;
        int capacity = 20;
        int data = 80;
        insertAtEnd(arr, capacity, n, data);
       Arrays.stream(arr).forEach(System.out::println);
    }
}
