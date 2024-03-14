package leetcode;

public class ReverseString2 {
    public String reverse (String arg){
        char[] arr = arg.toCharArray();
        int length = arr.length;
        char temp;
        for (int i = 0; i < length/2; i++) {
            temp = arr[i];
            arr[i] = arr[(length-i)-1];
            arr[(length-i)-1] = temp;
        }
        return new String(arr);
    }

    public static void main (String[] args){
        String s = "Hello";
        ReverseString2 reverseString2 = new ReverseString2();
        System.out.println(reverseString2.reverse(s));

    }
}
