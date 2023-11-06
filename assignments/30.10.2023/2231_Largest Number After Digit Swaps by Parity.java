class Solution {
    public int largestInteger(int num) {

        PriorityQueue<Integer> odd_pq = new PriorityQueue<>();
        PriorityQueue<Integer> even_pq = new PriorityQueue<>();

        int b_num= num;
        while(num>0){
            int curr = num%10;

            if(curr %2 == 1) odd_pq.add(curr);
            else even_pq.add(curr);
            num /= 10;
        }

        StringBuilder sb = new StringBuilder();
        num = b_num;

        while(num>0){
            int curr = num%10;

            if(curr % 2 == 1) sb.insert(0, odd_pq.poll());
            else sb.insert(0, even_pq.poll());
            
            num /= 10;
        }
        return Integer.parseInt(sb.toString());
    }
}