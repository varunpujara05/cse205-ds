class Solution {
    public int maxProduct(int[] nums) {

    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    
    for(int num : nums)  pq.offer(num);
    int max1=pq.poll();  
    int max2=pq.poll();
  
    return (max1-1)*(max2-1);
    }
}