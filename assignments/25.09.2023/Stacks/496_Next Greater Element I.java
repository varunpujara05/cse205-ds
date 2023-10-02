class Solution {
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
	int[] res = new int[nums1.length];
  Stack<Integer> stack = new Stack<>();
	HashMap<Integer, Integer> m = new HashMap<>();
	for(int i: nums2) 
	{
			while(!stack.isEmpty() && i > stack.peek()) 
			{
				m.put(stack.pop(), i);
			}
			stack.add(i);
	}

	int j = 0;
	for(int k : nums1) 
	{
		res[j++] = m.getOrDefault(k, -1);
	}
	return res;
	}
}