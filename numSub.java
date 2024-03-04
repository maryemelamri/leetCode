class Solution {
    public int numSub(String s) {
        long count = 0;
        long result = 0;
       long l =1000000007L;

        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if( c== '1')
                count++;
            else{   
                result+= ((count+1)* count)/2;
                count=0;
            }

        }
        result += (   count * (count + 1)) / 2;
        //    return result;
        System.out.println( result +"result");
        int   res= (int) (result % (Math.pow(10,9)+7));
        System.out.println( res +"res");
          return res;
    
    }
}
