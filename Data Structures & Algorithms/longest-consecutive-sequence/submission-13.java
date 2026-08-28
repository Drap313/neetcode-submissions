class Solution {
    public int longestConsecutive(int[] nums) {
        
        

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i = 0; i< nums.length;i++){
            set1.add(nums[i]);
            
        }
        
        for(int i:set1){
            if(!set1.contains(i-1) && set1.contains(i+1)){
               set2.add(i);
            }
        }
        int big = 1;
        for(int i:set2){
            int length = 1;
            int num = 1;
            while(set1.contains(i+num)){
                length++;
                num++;
            }
            if(length>big){
                big = length;
                length = 0;
            }

        }
        if(nums.length == 0){
            big = 0;
        }
        return big;
    }
}
