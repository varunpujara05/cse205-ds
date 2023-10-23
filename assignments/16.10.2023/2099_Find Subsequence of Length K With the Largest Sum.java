class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        if(k == nums.length){
            return nums;
        }

        int[] tmp = nums.clone();
        Arrays.sort(tmp);
        Map<Integer, Integer> count = new HashMap<>();

        for(int i = n - 1; i >= n - k; i--){
            count.put(tmp[i], count.getOrDefault(tmp[i], 0) + 1);
        }

        int[] ans = new int[k];
        int idx = 0;

        for(int i = 0; i < nums.length; i++){
            if(count.containsKey(nums[i])){
                int num = count.get(nums[i]);
                ans[idx++] = nums[i];
                if(num == 1){
                    count.remove(nums[i]);
                }
                else{
                    count.put(nums[i], --num);
                }
            }
        }
        return ans;
    }
}