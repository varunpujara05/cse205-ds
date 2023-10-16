class Solution {
    public String frequencySort(String s) {
       int[][] arr = new int[123][2];
       for(char c: s.toCharArray()){
           arr[c][0]=c;
           arr[c][1]++;
       }
       StringBuilder sb = new StringBuilder();
       Arrays.sort(arr,(b,c)->c[1]-b[1]);
       for(int i=0;i<122;i++ ){
           if(arr[i][1]==0) break;
           for(int j=0;j<arr[i][1];j++){
               sb.append((char)arr[i][0]);
           }
       }
       return sb.toString();
    }
}