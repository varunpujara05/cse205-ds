class Solution {
    public int timeRequiredToBuy(int[] tickets, int i) {
    int res = 0;

    for (int j = 0; j < tickets.length; j++)
      if (j <= i)
        res += Math.min(tickets[j], tickets[i]);
      else
        res += Math.min(tickets[j], tickets[i] - 1);

    return res; 
    }
}