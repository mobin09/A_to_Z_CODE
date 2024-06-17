import java.util.HashSet;
import java.util.Set;
public class Neetcode001{
    // Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
    public static void main(String[] args) {
        int[] nums = {1,2,3,3};
        Set<Integer> set = new HashSet<>();    
        boolean isPresent = false;   
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                isPresent = true;
                break;
            }else{
                set.add(nums[i]);
            }
        }
        // If duplicates are avialiable
        System.out.println(isPresent);
    }
}