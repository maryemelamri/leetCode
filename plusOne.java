class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit by 1
            digits[i]++;
            // If the digit becomes 10, set it to 0 and continue the loop
            if (digits[i] < 10) {
                return digits;
            }
            digits[i] = 0;
        }
        
        // If carrying is required beyond the first digit
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
