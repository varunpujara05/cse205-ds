class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;
        String[] ans = new String[n];
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->score[b]-score[a]);
        
        for(int i=0; i<n; i++){
            pq.add(i);
        }

        int i=1;
        while(!pq.isEmpty()){

            int j = pq.poll();
            
            if(i>3)       ans[j] = Integer.toString(i);
            else if(i==1) ans[j] = "Gold Medal";
            else if(i==2) ans[j] = "Silver Medal";
            else if(i==3) ans[j] = "Bronze Medal";
            i++;
        }
        
        return ans;
        
    }
}