class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> res = new ArrayList<>();

    permutations(res, new ArrayList<>(), nums);
    return res;
  }

  public void permutations(List<List<Integer>> res, ArrayList<Integer> tmp, int[] nums) {
    if (tmp.size() == nums.length) {
      res.add(new ArrayList<>(tmp));
      return;
    }
    for (int num:nums) 
    {
      if (tmp.contains(num))
        continue;
      tmp.add(num);
      permutations(res,tmp, nums);
      tmp.remove(tmp.size() - 1);
    }
  }
}