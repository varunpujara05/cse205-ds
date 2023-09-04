class Solution {
    public int triangularSum(int[] nums) {
        return t_sum(nums,nums.length);
    }
    
    public int t_sum(int[] arr, int n){
        if(n == 1)
            return arr[0];
            
        for(int i=0;i<n-1;i++){
            arr[i] = (arr[i] + arr[i+1])%10; 
        }
        return t_sum(arr,n-1);
    }
}