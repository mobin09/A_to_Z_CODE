import java.util.Arrays;

public class Neetcode003 {
    public static void main(String[] args) {
      int[] nums={3,2,3};
      int target=6;
      Arrays.sort(nums);
      int[] ret = new int[2];
      int start = 0;
      int end = nums.length-1;
      while(start < end){
        if(nums[start] + nums[end] == target){
            ret[0]= start;
            ret[1] = end;
            break;
        }else if(nums[start] + nums[end] < target){
            start++;
        }else{
            end--;
        }
      }

      System.out.println(Arrays.toString(nums));

    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // two sum using the two pointers technique
        int[] n = new int[2];
        for(int i=0; i<nums.length -1; i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[i] + nums[j] == target){
                    n[0] = i;
                    n[1] = j;
                    return n;
                }
            }
        }
        return n;
    }
}
