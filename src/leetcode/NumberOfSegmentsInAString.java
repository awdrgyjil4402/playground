package leetcode;

public class NumberOfSegmentsInAString {
    public int solution (String arg) {
        int length = arg.length();
        int segments = 1;
        for (int i = 0; i < length-1; i++) {
            if (arg.charAt(i) == ' ') {
                segments = segments + 1;
            }
        }
        return segments;
    }
    public static void main (String[] args) {
        String s = "Hello, my name is John";
        NumberOfSegmentsInAString numberOfSegmentsInAString = new NumberOfSegmentsInAString();
        System.out.println(
                numberOfSegmentsInAString.solution(s)
        );
    }
}
