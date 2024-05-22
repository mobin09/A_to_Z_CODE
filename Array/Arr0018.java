public class Arr0018 {
    public static void main(String[] args){
    int[] arr= {1, -2, 1, 0, 5};
    int target = 0;
    boolean isPresent = false;
    for(int i=0; i<arr.length - 1; i++){
        for(int j=i +1; j<arr.length; j++){
            if(arr[i] + arr[j] == target){
                isPresent = true;
                break;
            }
        }
        if(isPresent == true){
            break;
        }
    }
    if(isPresent == true){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}
