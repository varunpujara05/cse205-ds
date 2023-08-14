class Solution {
    
    public void reverseString(char[] s) {
        recursion_reverse_string(s,0,s.length-1);
    }
       static void recursion_reverse_string(char[] s,int i,int j){
           if(i>=j)
           {
               return;
           }
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        recursion_reverse_string(s,i+1,j-1);
    }
}