package leetcode;

import java.util.Arrays;

public class ReverseString {
    public void reverse (String[] arr){
        int length = arr.length;
        String temp;
        for (int i = 0; i < length/2; i++) {
            temp = arr[i];
            arr[i] = arr[(length-i)-1];
            arr[(length-i)-1] = temp;
        }
    }

    public static void main (String[] args){
        String[] s = {"H","a","n","n","a","h"};
        ReverseString reverseString = new ReverseString();
        reverseString.reverse(s);
        System.out.println(Arrays.toString(s));
    }
}
