public class isPalindrome {
    public boolean isPalindrome(int x) {
        String p[]= String.valueOf(x);
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == p.charAt(p.length() - 1 - i)) {
                return true;
            }
        }
        return false;
    }
}
