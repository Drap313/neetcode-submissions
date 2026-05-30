class Solution {
    public int[] twoSum(int[] nums, int target) {
    java.util.HashMap<Integer,Integer> map = new java.util.HashMap<>();
    int[] locations = new int[2];
    
     for (int i = 0; i<nums.length;i++){
        int diff = target-nums[i];
        if(map.containsKey(diff)){
            locations[1] = i;
            locations[0] = map.get(diff);
        }
        else{
            map.put(nums[i],i);
        }
     }
     return locations;
    }

}
