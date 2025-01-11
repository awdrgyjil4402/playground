// Given a valid (IPv4) IP address, return a defanged version of that IP address.
//
// A defanged IP address replaces every period "." with "[.]".
//
//
//
// Example 1:
//
// Input: address = "1.1.1.1"
// Output: "1[.]1[.]1[.]1"
// Example 2:
//
// Input: address = "255.100.50.0"
// Output: "255[.]100[.]50[.]0"
//
//
// Constraints:
//
// The given address is a valid IPv4 address.

package leetcode;

public class DefangIP {
    String input = "255.100.50.0";
    char[] inputArray = input.toCharArray();
    String output = "";

    public String deFang (){
        int inputArrayLength = inputArray.length;
        for (int i = 0; i < inputArrayLength; i++) {
             if (inputArray[i] == '.') {
                 output = output + "[.]";
            } else {
                 output = output + inputArray[i];
             }
        }
        return output;
    }

    public static void main (String[]args) {
          var defang = new DefangIP();
          System.out.println(defang.deFang());
    }
}
