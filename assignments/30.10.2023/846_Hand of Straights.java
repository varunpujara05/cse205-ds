class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {

        if(hand.length % groupSize != 0) return false;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int x : hand) minHeap.add(x);

        while(!minHeap.isEmpty()){
            int front = minHeap.poll();
            for(int i=1; i < groupSize; i++)
                if(!minHeap.remove(front+i)) return false;
        }
        return true;
    }
}