//https://leetcode.com/problems/running-sum-of-1d-array/submissions/
class RunningSumofArray {
    public int[] runningSum(int[] nums) {
        int temp = nums[0];
        
        int[] result = new int[nums.length];
        result[0] = temp;
        for(int i=1; i<nums.length; i++)
        {
            result[i] = temp+nums[i];
            temp += nums[i];
        }
        
        return result;
    }
}