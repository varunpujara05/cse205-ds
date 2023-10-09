class Solution {
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
 
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
 
    public static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public int heightChecker(int[] heights) {
        int clone_heights[] = heights.clone();
        quickSort(heights,0,heights.length-1);

        int cnt=0;

        for(int i = 0;i<heights.length;i++){
            if (heights[i] != clone_heights[i]){
                cnt++;
            }
        }
        return cnt;
    }
}