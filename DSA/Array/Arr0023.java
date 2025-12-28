public class Arr0023 {
    public static void main(String[] args) {
        int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
        int n = arr.length;
        for(int i=0; i<n-1;i++){
            int maxCount = 1;
            for(int j = i+1; j <n; j++){
                if(arr[i] == arr[j]){
                    maxCount++;
                }
            }
            if(maxCount %2 != 0){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
