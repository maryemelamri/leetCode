class Solution {
    public int lengthOfLastWord(String s) {
        String[] out = s.split(" ");
       return out[out.length - 1].length();
        
    }
}
