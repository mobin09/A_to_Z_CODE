public class Day7 {
    public static void main(String[] args){
        int[] arr = {100, 200, 300, 400, 350};

        boolean isAscendingDiff = true;
        int i=1;
        while(i < arr.length){
            if(arr[i-1] <= arr[i]){

            }else{
                isAscendingDiff = false;
                break;
            }
            i++;
        }

        if(isAscendingDiff == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}
