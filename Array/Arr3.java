import java.util.Arrays;
public class Arr3 {
    static void insertElemnt(int[] arr, int n, int pos, int data, int capacity){
            if(n >= capacity){
                 System.out.println("Already filled");
                 return;
            }
            for(int i = n-1; i>=pos-1; i--  ){
                arr[i+1] = arr[i];
            }
            arr[pos-1] = data;
    }
    public static void main(String[] args) {
        int arr[] = new int[15];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 1;
        arr[3] = 8;
        arr[4] = 5;
        int n = 5;
        int x = 10, pos = 2;
        insertElemnt(arr, n,pos,x, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
