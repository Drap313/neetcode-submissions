class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        java.util.HashMap<Integer,Integer> map = new java.util.HashMap<>();
        for(int i = 0; i< nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        System.out.println(map);
        while(k>0){
        int largest = 0;
        int index = 0;
        for (int i : map.keySet()) {
            if(map.get(i)== null){
                continue;
            }
            if(largest<map.get(i)){
                largest = map.get(i);
                System.out.println(largest);
                index = i;
            }    
        }
    
   
        arr[k-1] = (index);
        map.remove(index);
        k--;
        }        
        System.out.println(map);
        return arr;
    }
}
