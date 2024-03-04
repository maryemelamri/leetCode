class Solution {
    public int numSub(String s) {
         int count = 0;
        int result = 0;
        for(char c : s.toCharArray()){
            if( c== '1')
                count++;
            else{
                result+= ((count+1)* count)/2;
                count=0;
            }


        }
            result+= ((count+1)* count)/2;
            return result;
    
    
    }
}
