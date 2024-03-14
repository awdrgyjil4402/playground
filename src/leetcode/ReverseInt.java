package leetcode;

public class ReverseInt {
    public int reverse (int arg) {
        int length = String.valueOf(arg).length();
        int output = 0;
        int temp = arg;
        for (int i = 0; i < length; i++) {
            int r = temp % 10;
            temp = temp / 10;
            if (i < 1) {
                output = r;
            }
            if (i > 0) {
                output = output * 10 + r;
            }

        }
        return output;
    }

    public int reverse2(int arg) {
        int output = 0;
        int temp = arg;
        while (temp != 0) {
            int r = temp % 10;
            temp = temp / 10;
            output = output * 10 + r;
        }
        return output;
    }

    public static void main (String[] args) {
        int nums = 39658;
        ReverseInt reverseInt = new ReverseInt();
        System.out.println(reverseInt.reverse2(nums));
    }
}
