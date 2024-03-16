/*
https://leetcode.com/problems/number-of-segments-in-a-string/description/

Given a string s, return the number of segments in the string.

A segment is defined to be a contiguous sequence of non-space characters.



Example 1:

Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
Example 2:

Input: s = "Hello"
Output: 1


Constraints:

0 <= s.length <= 300
s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:".
The only space character in s is ' '.

 */

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
