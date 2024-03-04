class Solution {
    public int removeDuplicates(int[] nums) {
        int count = nums.length;
        for(int i = 0; i<count-1; i++){
            if(nums[i]== nums[i+1]){
               for(int j =i+1; j< count -1 ; j++){
                    nums[j]= nums[j+1];
                    
               }
               count--;
               i--;
            }
        }
        return count;
    }
}
