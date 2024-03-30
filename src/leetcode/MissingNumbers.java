/*
https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in
the range [1, n] that do not appear in nums.



Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Example 2:

Input: nums = [1,1]
Output: [2]


Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n


Follow up: Could you do it without extra space and in O(n) runtime?
You may assume the returned list does not count as extra space.
 */

package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumbers {
    public int[] solution (int[] nums) {
        int n = nums.length;
        ArrayList output = new ArrayList();
        int temp;
        for (int i = 0; i < n;) {
            temp = nums[nums[i]-1];
            nums[nums[i]-1] = nums[i];
            nums[i] = temp;
            if (nums[i] == i+1) {
                i++;
            }
            if (nums[i] == nums[nums[i]-1]) {
                i++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i+1) {
                output.add(i+1);
            }
        }
        int[] outputarray = new int[output.size()];
        for (int i = 0; i < output.size(); i++) {
            outputarray[i] = (int) output.get(i);
        }
        return outputarray;
    }
    public static void main (String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};
        int[] nums2 = {1, 3, 2, 7, 8, 2, 3, 4};
        MissingNumbers missingNumbers = new MissingNumbers();
        System.out.println(Arrays.toString(missingNumbers.solution(nums2)));
    }

}
