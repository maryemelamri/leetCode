class Solution {
    // public boolean isValid(String s) {
    //     boolean v= false;
    //     for(int i=0; i<s.length()-1; i++){
    //         if (s.charAt(i)=='('){
    //             if( s.charAt(i+1) == ')')
    //                 v = true;
    //         }
    //        else if (s.charAt(i)=='['){
    //             if( s.charAt(i+1) == ']')
    //                 v = true;
    //         }
    //         else if (s.charAt(i)=='{'){
    //             if( s.charAt(i+1) == '}')
    //                v = true;
    //             else v= false;   
    //         }
            
    //     }

    //   return v;
    // }

  public boolean isValid(String s) {
    boolean v= true;
    Stack<Character> stack = new Stack();
    for(int i=0; i< s.length(); i++){
        char c= s.charAt(i);
        if(c=='(' || c=='[' || c=='{' ){
            stack.push(c);
        }
        else {
            if(stack.isEmpty()){
                v=false;
            }
            char top = stack.pop();
            if((c==')' && top!='(' )||(c==']' && top!='[' ) || (c=='}' && top!='{' )){
                v= false;
            }
        }
        if(s.length())

    }

      return ;
    }

}
