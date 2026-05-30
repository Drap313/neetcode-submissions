class Solution {
    public int[] twoSum(int[] nums, int target) {
    java.util.HashMap<Integer,Integer> map = new java.util.HashMap<>();
    int[] locations = new int[2];
    
     for (int i = 0; i<nums.length;i++){
        int diff = target-nums[i];
        if(map.containsKey(diff)){
            locations[1] = i;
            locations[0] = map.get(diff);
            //map.put(nums[i],map.get(diff));
        }
        else{
            map.put(nums[i],i);
        }
     }
    System.out.println(map);
     /*
     for(int i = 0; i<nums.length;i++){
        int diff = target-nums[i];
        System.out.println(i);

        if(map.containsKey(diff) && (map.size()<=nums.length)){
            System.out.println(map.get(diff));
            locations[0]=map.get(diff);
            locations[1]=i;
            break;
        }
        */
     
     /*
     for (int i = 0; i<nums.length;i++){
        
        if(map.containsKey(target-nums[i])){
            locations[0] = map.get(nums[i]);
            if(map.get(target-nums[i])==map.get(nums[i])){
                map.remove(target-nums[i]);
                locations[1] = (map.get(target-nums[i]));
                break;
            }
            else{
                locations[1] = (map.get(target-nums[i]));
                break;
            }
        }
     }
     */
     return locations;

    }

}
