package PracticeArr;

import java.util.Arrays;

/**
 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

 

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
 * 
 */



public class Day4 {

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        int i = 0;
        while(i < n){
            ans[i] = nums[i];
            i++;
        }
       int j=0;
       while(i < ans.length){
          ans[i] = nums[j];
          i++;
          j++;
       }
        
        return ans;
    }
    public static void main(String[] args){
        System.out.println("Day4");
        int[] a = {1,2,1};
       a =  getConcatenation(a);
       System.out.println(Arrays.toString(a));

    }
}
