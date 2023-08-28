class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(candidates);
    combSum2(0, candidates, target, new ArrayList<>(), res);
    return res;
  }

  public void combSum2(int start, int[] candidates, int target, List<Integer> tmp,
                                                List<List<Integer>> res) {
    if (target < 0)
      return;
    if (target == 0) {
      res.add(new ArrayList<>(tmp));
      return;
    }
    for (int i = start; i < candidates.length; i++) 
    {
      if (i > start && candidates[i] == candidates[i - 1])
        continue;
      tmp.add(candidates[i]);
      combSum2(i + 1, candidates, target - candidates[i], tmp, res);
      tmp.remove(tmp.size() - 1);
    }
}
}