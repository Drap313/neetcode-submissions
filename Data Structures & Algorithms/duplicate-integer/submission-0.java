class Solution {
    public boolean hasDuplicate(int[] nums) {
       java.util.HashMap<String,Integer> dupes = new java.util.HashMap<>();
       for(int i = 0; i< nums.length;i++){
        dupes.put(" "+nums[i],i);
       } 
    
        if(dupes.size()<nums.length){
            return true;
        }
        else{
            return false;
        }
    }
    
}