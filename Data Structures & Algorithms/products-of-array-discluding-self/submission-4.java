class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int[] right = new int[nums.length];
        int[] left = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            int r_sum = 1;
            for(int j = i+1; j<nums.length;j++){
                r_sum*=nums[j];
            }
            right[i] = r_sum;
            int l_sum = 1;
            for(int k = i; k>0;k--){
                l_sum*=nums[k-1];
            }
            left[i] =l_sum;
        }
        for(int i = 0; i<nums.length;i++){
            output[i]= right[i]*left[i];
        }
        
        
        
        //if we could multiply every number ahead of the target
        //and then multiply every number before and then multiply those
        //sums together

      return output;  
    }
}  
