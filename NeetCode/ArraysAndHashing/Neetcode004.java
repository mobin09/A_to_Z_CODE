import java.util.Arrays;

public class Neetcode004 {

    public static void main(String[] args){
        // Concatenation of Array
        int[] nums = {1,2,1};
        int[] retArr = new int[2*nums.length];
        int i=0;
        while(i < nums.length){
            retArr[i] = nums[i];
            i++;
        }

        int j = 0;
        while(i < retArr.length){
            retArr[i] = nums[j];
            j++;
            i++;
        }
    
        System.out.println(Arrays.toString(retArr));

    }
}