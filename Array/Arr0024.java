public class Arr0024 {
    public static void main(String[] args) {
        int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
        int n = arr.length;

        int res = 0;
        for(int i=0; i<n; i++){
            res = res ^ arr[i];
        }
        System.out.println(res);
    }
}
