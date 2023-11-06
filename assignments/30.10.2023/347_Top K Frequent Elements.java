class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> hm = new HashMap<>();

        for(int i : nums) hm.put(i, hm.getOrDefault(i, 0) + 1);
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> hm.get(b) - hm.get(a));
        for(int key : hm.keySet()) maxHeap.add(key);

        int ans[] = new int[k];

        for(int i = 0; i < k; i++) ans[i] = maxHeap.poll();
        
        return ans; 
    }
}