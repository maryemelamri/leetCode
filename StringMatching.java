class Solution {
    public int strStr(String haystack, String needle) {
        int haystacklenght = haystack.length();
        int needlelenght = needle.length();
        if (needle.isEmpty() || haystacklenght<=1) {
            return 0;
        }
        for (int i=0; i <= haystacklenght - needlelenght; i++){
                int j;
                for(j= 0; j< needlelenght; j++ ){
                    if(haystack.charAt(i + j) != needle.charAt(j)){
                        break;
                    }
                }
                if(j == needlelenght){
                    return i;
                
                }
           
        }
        return -1;
    }
}
