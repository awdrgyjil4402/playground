package leetcode;

import java.util.Arrays;

/*
https://leetcode.com/problems/squares-of-a-sorted-array/description/

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.



Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]


Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.


Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
Solution: https://leetcode.com/problems/squares-of-a-sorted-array/solutions/4807685/beats-100-users-c-java-python-javascript-3-approaches-explained/
 */

public class SquareOfSortedArray{
    public void solution(int[] arr){
        int length = arr.length;
        for (int n = 0; n < length; n++) {
            arr[n] = arr[n] * arr[n];
        }
        bubbleSort(arr);
    }

    public void bubbleSort(int [] arr) {
        int length = arr.length;
        for (int n = length; n > 0; n--){
            for (int i = 0; i < length-1; i ++) {
                int x = arr[i];
                int y = arr[i+1];
                if (x > y) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    public void swap (int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main (String[] args) {
        int[] nums = {-4,-1,0,3,10};
        SquareOfSortedArray squareOfSortedArray = new SquareOfSortedArray();
        squareOfSortedArray.solution(nums);
        System.out.println(Arrays.toString(nums));
    }
}