package leetcode;

import java.util.Arrays;

public class ReverseBubbleSort {
    public void bubbleSort (int[] arr) {
        int length = arr.length;
        for (int n = length; n > 0; n--) {
            for (int i = length -1; i > 0; i--) {
                int x = arr[i];
                int y = arr[i-1];
                if (x > y) {
                    swap(arr, i, i-1);
                }
            }
        }
    }

    public void swap(int[] arr, int x, int y)  {
        int tmp;
        tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;

    }

    public static void main (String[] args) {
        int[] input = {27, 64, 11, 49, 73, 8, 35, 50, 92, 18, 67, 23, 58, 44, 79};
        ReverseBubbleSort reverseBubbleSort = new ReverseBubbleSort();
        reverseBubbleSort.bubbleSort(input);
        System.out.println(Arrays.toString(input));
    }
}
