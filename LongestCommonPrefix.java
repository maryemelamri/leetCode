public String longestCommonPrefix(String[] strs) {
        String prefix="";
       
        for (int j = 0; j < strs[0].length(); j++) {

            for (int i = 1; i < strs.length; i++) {

                if (j >= strs[i].length() || strs[i].charAt(j) != strs[0].charAt(j)) {
         
                    return prefix;

                }
            }
            prefix += strs[0].charAt(j);
        }
    
         return prefix;
    }
