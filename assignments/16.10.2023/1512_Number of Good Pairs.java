class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            if (hm.containsKey(num)) {
                int i = hm.get(num);
                count += i;
                hm.put(num, i + 1);
            } 
            else {
                hm.put(num, 1);
            }
        }
        return count;

    }
}