class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    int c=0;
    int res=0;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==0)
        {
            res=Math.max(res,c);
            c=0;
        }
        else
        {
            c++;
        }
    }
    return Math.max(res,c);
    }
}