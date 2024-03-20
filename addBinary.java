class Solution {
    public String addBinary(String a, String b) {
        //  result to store the result of the addition operation
        StringBuilder result = new StringBuilder();
        //carry to keep track of any carry generated during addition.
        int carry = 0;
        //i to the index of the rightmost (least significant) digit in string a.
        int i = a.length() - 1;
        //j to the index of the rightmost (least significant) digit in string b.
        int j = b.length() - 1;
        //Enters a while loop to iterate over the digits of both strings from right to left until both strings are   fully processed (i.e., until both i and j become less than 0
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            result.append(sum % 2);
            carry = sum / 2;
        }
        
        // If there's still a carry after processing both strings
        if (carry != 0) {
            result.append(carry);
        }
        
        // Reverse the result string to get the final binary sum
        return result.reverse().toString();
    }
}
