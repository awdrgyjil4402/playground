package leetcode;

import java.util.Arrays;

public class BubbleSort {
    public void bubblesort (int[] arr) {
        int length = arr.length;
        for (int n = length ; n > 0 ; n --) {
            for (int i = 0; i < length - 1; i++) {
                int x = arr[i];
                int y = arr[i + 1];
                if (x > y) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

    }

    public static void main (String[] args) {
        int[] input = {27, 64, 11, 49, 73, 8, 35, 50, 92, 18, 67, 23, 58, 44, 79};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubblesort(input);
        String outputString = Arrays.toString(input);
        System.out.println(outputString);
    }
}
