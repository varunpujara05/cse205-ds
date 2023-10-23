class Solution {
    public int[] findErrorNums(int[] nums) {
        int res[] = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums) {

            hm.put(i,hm.getOrDefault(i,0)+1);

        }
        for(int i=0;i<nums.length;i++){

            if(!hm.containsKey(i+1)) res[1] = i+1;
            else if(hm.get(nums[i])==2) res[0] = nums[i];

        }
        return res;
    }
}