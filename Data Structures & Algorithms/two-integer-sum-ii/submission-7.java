class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] indx = new int[2];
        int i = 0;
        int j = i+1;
        while((numbers[i]+numbers[numbers.length-j])!=target){
            if((numbers[i]+numbers[numbers.length-j]) > target){
                j++;
            }
            if(numbers[i]+numbers[numbers.length-j]<target){
                i++;
            }

        }
        indx[0]=i+1;
        indx[1]= numbers.length-j+1;
        return indx;
    }
}
