class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> comb= new ArrayList<>();
        combSum(0,candidates,target,new ArrayList(),comb);
        return comb;
    }
    public void combSum(int start,int[] nums,int target,List<Integer> temp,List<List<Integer>> comb)
    {
        if(target==0)
        {
            comb.add(new ArrayList(temp));
        }
       if(target<0)
        {
            return;
        }
        for(int i=start;i<nums.length;i++)
        {
            temp.add(nums[i]);
            combSum(i,nums,target-nums[i],temp,comb);
            temp.remove(temp.size()-1);
        }
    }
}