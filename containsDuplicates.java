boolean solution(int[] a) {
     Set<Integer> set = new HashSet<>();
        for (int num : a) {
            if (!set.add(num)) {
                return true; // Duplicate found
            }
        }
        return false;

}
//Given an array of integers, write a function that determines whether the 
//array contains any duplicates. Your function should return true if any element
//appears at least twice in the array, and it should return false if every element is distinct
