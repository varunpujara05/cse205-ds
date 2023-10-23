class Solution {
    public boolean wordPattern(String pattern, String s) {

    String[] arr = s.split(" ");
    Map<Character, String> hm = new HashMap<>();

     if(pattern.length() != arr.length) return false;

     for(int i = 0; i < pattern.length(); i ++) {
         char ch = pattern.charAt(i);
         boolean cont_key = hm.containsKey(ch);

         if(hm.containsValue(arr[i]) && !cont_key) return false;
         if(cont_key && !hm.get(ch).equals(arr[i]))return false;
         else hm.put(ch, arr[i]);

     }  
     return true;
    }
}