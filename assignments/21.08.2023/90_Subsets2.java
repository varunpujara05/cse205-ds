class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(nums);
    subsets2(nums, 0, new ArrayList<>(), res);
    return res;
  }

  public void subsets2(int[] nums, int start, List<Integer> tmp, List<List<Integer>> res) {

    res.add(new ArrayList<>(tmp));
    for (int i = start; i < nums.length; i++) {
      if (i > start && nums[i] == nums[i - 1])
        continue;
          tmp.add(nums[i]);
          subsets2(nums, i + 1, tmp, res);
          tmp.remove(tmp.size() - 1);
    }
  }
}