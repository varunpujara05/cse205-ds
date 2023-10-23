class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int cmpt = target - nums[i];

            if (hm.containsKey(cmpt)) {
                return new int[]{hm.get(cmpt), i};
            }
            hm.put(nums[i], i);
        }
        return new int[]{};
    }
}