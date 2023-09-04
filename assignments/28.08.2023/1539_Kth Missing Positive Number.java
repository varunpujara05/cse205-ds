class Solution {
  public int findKthPositive(int[] arr, int k) {
    int left = 0;
    int right= arr.length;
    while (left<right) {
    int mid = (left + right) / 2;
      if (arr[mid] - mid - 1 >= k)
        right = mid;
      else
        left = mid + 1;
    }
    return left + k;
  }
}