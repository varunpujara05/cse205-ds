class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        combinations(1,n,new ArrayList(),res,k);
        return res;
    }
    public void combinations(int start,int n,List<Integer> temp,List<List<Integer>> res,int k)
    {
        if(temp.size()==k)
        {
            res.add(new ArrayList(temp));
            return;
        }
        for(int i=start;i<=n;i++)
        {
            temp.add(i);
            combinations(i+1,n,temp,res,k);
            temp.remove(temp.size()-1);
        }
    }
}