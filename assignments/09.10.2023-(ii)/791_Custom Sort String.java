class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
               hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            else
               hm.put(s.charAt(i),1);
        }
        String ans_str ="";
        
        for(int i=0;i<order.length();i++)
        {
            char c = order.charAt(i);
            if(!hm.containsKey(c))
                continue;
            int f = hm.get(c);
            for(int j=0;j<f;j++){
                ans_str += Character.toString(c);
            } 
            hm.remove(c);
        }
        
        for(Character key : hm.keySet())
        {
            int f = hm.get(key);
            for(int j=0;j<f;j++){
                ans_str+=Character.toString(key);
            }
        }
        return ans_str;
    }
}